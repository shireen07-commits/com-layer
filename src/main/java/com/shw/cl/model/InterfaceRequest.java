/**
 * 
 */
package com.shw.cl.model;


import org.springframework.stereotype.Component;


/**
 * @author shireen
 *
 */
@Component
public class InterfaceRequest {
	
	public InterfaceRequest() {
	}
	
	private Integer interfaceid;
	private String interfacename;
	private String interfacedescription;
	private boolean isactive;
	public Integer getInterfaceid() {
		return interfaceid;
	}
	public void setInterfaceid(Integer interfaceid) {
		this.interfaceid = interfaceid;
	}
	public String getInterfacename() {
		return interfacename;
	}
	public void setInterfacename(String interfacename) {
		this.interfacename = interfacename;
	}
	
	public String getInterfacedescription() {
		return interfacedescription;
	}
	public void setInterfacedescription(String interfacedescription) {
		this.interfacedescription = interfacedescription;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	
}
