package com.shw.cl.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Result {
	
	public Map<Object,Object> value = new LinkedHashMap<>();
	

	public Map<Object, Object> getValue() {
		return value;
	}

	public void setValue(Map<Object, Object> value) {
		this.value = value;
	}
	

	
}

	
	/*
	 * public String externalCode; // public Date startDate; public String country;
	 * // public Date lastModifiedDateTime; public String name_localized; // public
	 * Date endDate; // public Date createdDateTime; public Object
	 * description_pt_BR; public Object description_es_MX; public Object
	 * description_es_ES; public Object name_pt_BR; public String standardHours;
	 * public Object description_defaultValue; public Object name_de_DE; public
	 * String name; public Object name_es_ES; public Object description_en_US;
	 * public Object name_es_MX; public Object description_en_DEBUG; public Object
	 * description_it_IT; public String status; public Object description_fr_FR;
	 * public Object name_it_IT; public Object description; public Object
	 * description_de_DE; public Object name_fr_FR; public Object name_en_DEBUG;
	 * //public Date createdOn; public String name_en_US; public String currency;
	 * public Object name_fr_CA; public Object name_zh_CN; public String
	 * name_defaultValue; public Object description_en_GB; public String
	 * lastModifiedBy; public Object defaultPayGroup; public Object name_en_GB;
	 * //public Date lastModifiedOn; public Object description_zh_CN; public String
	 * createdBy; public Object description_fr_CA; public Object
	 * description_localized; public Object defaultLocation; public String
	 * getExternalCode() { return externalCode; } public void setExternalCode(String
	 * externalCode) { this.externalCode = externalCode; } public String
	 * getCountry() { return country; } public void setCountry(String country) {
	 * this.country = country; } public String getName_localized() { return
	 * name_localized; } public void setName_localized(String name_localized) {
	 * this.name_localized = name_localized; } public Object getDescription_pt_BR()
	 * { return description_pt_BR; } public void setDescription_pt_BR(Object
	 * description_pt_BR) { this.description_pt_BR = description_pt_BR; } public
	 * Object getDescription_es_MX() { return description_es_MX; } public void
	 * setDescription_es_MX(Object description_es_MX) { this.description_es_MX =
	 * description_es_MX; } public Object getDescription_es_ES() { return
	 * description_es_ES; } public void setDescription_es_ES(Object
	 * description_es_ES) { this.description_es_ES = description_es_ES; } public
	 * Object getName_pt_BR() { return name_pt_BR; } public void
	 * setName_pt_BR(Object name_pt_BR) { this.name_pt_BR = name_pt_BR; } public
	 * String getStandardHours() { return standardHours; } public void
	 * setStandardHours(String standardHours) { this.standardHours = standardHours;
	 * } public Object getDescription_defaultValue() { return
	 * description_defaultValue; } public void setDescription_defaultValue(Object
	 * description_defaultValue) { this.description_defaultValue =
	 * description_defaultValue; } public Object getName_de_DE() { return
	 * name_de_DE; } public void setName_de_DE(Object name_de_DE) { this.name_de_DE
	 * = name_de_DE; } public String getName() { return name; } public void
	 * setName(String name) { this.name = name; } public Object getName_es_ES() {
	 * return name_es_ES; } public void setName_es_ES(Object name_es_ES) {
	 * this.name_es_ES = name_es_ES; } public Object getDescription_en_US() { return
	 * description_en_US; } public void setDescription_en_US(Object
	 * description_en_US) { this.description_en_US = description_en_US; } public
	 * Object getName_es_MX() { return name_es_MX; } public void
	 * setName_es_MX(Object name_es_MX) { this.name_es_MX = name_es_MX; } public
	 * Object getDescription_en_DEBUG() { return description_en_DEBUG; } public void
	 * setDescription_en_DEBUG(Object description_en_DEBUG) {
	 * this.description_en_DEBUG = description_en_DEBUG; } public Object
	 * getDescription_it_IT() { return description_it_IT; } public void
	 * setDescription_it_IT(Object description_it_IT) { this.description_it_IT =
	 * description_it_IT; } public String getStatus() { return status; } public void
	 * setStatus(String status) { this.status = status; } public Object
	 * getDescription_fr_FR() { return description_fr_FR; } public void
	 * setDescription_fr_FR(Object description_fr_FR) { this.description_fr_FR =
	 * description_fr_FR; } public Object getName_it_IT() { return name_it_IT; }
	 * public void setName_it_IT(Object name_it_IT) { this.name_it_IT = name_it_IT;
	 * } public Object getDescription() { return description; } public void
	 * setDescription(Object description) { this.description = description; } public
	 * Object getDescription_de_DE() { return description_de_DE; } public void
	 * setDescription_de_DE(Object description_de_DE) { this.description_de_DE =
	 * description_de_DE; } public Object getName_fr_FR() { return name_fr_FR; }
	 * public void setName_fr_FR(Object name_fr_FR) { this.name_fr_FR = name_fr_FR;
	 * } public Object getName_en_DEBUG() { return name_en_DEBUG; } public void
	 * setName_en_DEBUG(Object name_en_DEBUG) { this.name_en_DEBUG = name_en_DEBUG;
	 * } public String getName_en_US() { return name_en_US; } public void
	 * setName_en_US(String name_en_US) { this.name_en_US = name_en_US; } public
	 * String getCurrency() { return currency; } public void setCurrency(String
	 * currency) { this.currency = currency; } public Object getName_fr_CA() {
	 * return name_fr_CA; } public void setName_fr_CA(Object name_fr_CA) {
	 * this.name_fr_CA = name_fr_CA; } public Object getName_zh_CN() { return
	 * name_zh_CN; } public void setName_zh_CN(Object name_zh_CN) { this.name_zh_CN
	 * = name_zh_CN; } public String getName_defaultValue() { return
	 * name_defaultValue; } public void setName_defaultValue(String
	 * name_defaultValue) { this.name_defaultValue = name_defaultValue; } public
	 * Object getDescription_en_GB() { return description_en_GB; } public void
	 * setDescription_en_GB(Object description_en_GB) { this.description_en_GB =
	 * description_en_GB; } public String getLastModifiedBy() { return
	 * lastModifiedBy; } public void setLastModifiedBy(String lastModifiedBy) {
	 * this.lastModifiedBy = lastModifiedBy; } public Object getDefaultPayGroup() {
	 * return defaultPayGroup; } public void setDefaultPayGroup(Object
	 * defaultPayGroup) { this.defaultPayGroup = defaultPayGroup; } public Object
	 * getName_en_GB() { return name_en_GB; } public void setName_en_GB(Object
	 * name_en_GB) { this.name_en_GB = name_en_GB; } public Object
	 * getDescription_zh_CN() { return description_zh_CN; } public void
	 * setDescription_zh_CN(Object description_zh_CN) { this.description_zh_CN =
	 * description_zh_CN; } public String getCreatedBy() { return createdBy; }
	 * public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }
	 * public Object getDescription_fr_CA() { return description_fr_CA; } public
	 * void setDescription_fr_CA(Object description_fr_CA) { this.description_fr_CA
	 * = description_fr_CA; } public Object getDescription_localized() { return
	 * description_localized; } public void setDescription_localized(Object
	 * description_localized) { this.description_localized = description_localized;
	 * } public Object getDefaultLocation() { return defaultLocation; } public void
	 * setDefaultLocation(Object defaultLocation) { this.defaultLocation =
	 * defaultLocation; }
	 * 
	 * 
	 */

