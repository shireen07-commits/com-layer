/**
 * 
 */
package com.shw.cl.controller;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shw.cl.category.DocumentProperty;
import com.shw.cl.entity.Root;


/**
 * @author shireen
 *
 */
@RestController
public class EngineMainController {

	Logger log = LoggerFactory.getLogger(EngineMainController.class);

	@Autowired
	RestTemplate restTemplate;

	@Value("${sf.username}")
	String sf_Username;

	@Value("${sf.password}")
	String sf_Password;

	@Value("${sf.baseurl}")
	String sf_baseUrl;

	@GetMapping(value = "/sfapi/common")
	public Object getValue(@RequestParam String query,@RequestParam(required = false) String filter,@RequestParam(required = false) String expand) {
		String fullquery = query;
		if(filter!=null)
			fullquery = fullquery +"&"+filter;
		if(expand!=null)
			fullquery = fullquery +"&"+expand;
		
		
		Object object = apiCall(fullquery);
		return object;
	}

	@GetMapping(value = "/sfapi/category")
	public Object getCategory(@RequestParam String query) {
		Object object = getCategoryApi(query);
		return object;
	}

	@GetMapping(value = "/restapi")
	public Object getVlue() throws ScriptException, NoSuchMethodException {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("groovy");		
		String fact = "def factorial(n) { n == 1 ? 1 : n * factorial(n - 1) }";
		engine.eval(fact);
		Invocable inv = (Invocable) engine;
		Object[] params = {5};
		Object result = inv.invokeFunction("factorial", params);
		return result;
	}

	public Object apiCall(String query) {
		ResponseEntity<Root> response = null;
		try {
			log.info("started controller " + query);
			String plainCreds = sf_Username + ":" + sf_Password;
			byte[] plainCredsBytes = plainCreds.getBytes();
			byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
			String base64Creds = new String(base64CredsBytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Basic " + base64Creds);
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			response = restTemplate.exchange(sf_baseUrl + query, HttpMethod.GET, entity, Root.class);
		} catch (Exception e) {
			log.error("Failed while communication -" + e.getMessage());
		}
		log.info("Ended controller " + query);
		if(response.getBody()==null)
			return null;
		if(response.getBody().getD()==null)
			return null;			
		return response.getBody().getD().getResults();

	}

	public Object getCategoryApi(String query) {
		ResponseEntity<com.shw.cl.category.Root> response = null;
		try {
			log.info("started controller " + query);
			String plainCreds = sf_Username + ":" + sf_Password;
			byte[] plainCredsBytes = plainCreds.getBytes();
			byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
			String base64Creds = new String(base64CredsBytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Basic " + base64Creds);
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			response = restTemplate.exchange(sf_baseUrl + query, HttpMethod.GET, entity,
					com.shw.cl.category.Root.class);
		} catch (Exception e) {
			log.error("Failed while communication -" + e.getMessage());
		}
		log.info("Ended controller " + query);
		if (response.getBody() != null
				&& Optional.ofNullable(response.getBody().getD()).map(DocumentProperty::getDocumentCategories).isPresent())
			return response.getBody().getD().getDocumentCategories().getAttachmemtCategories().getResults();

		return null;

	}

}
