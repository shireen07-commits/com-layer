package com.shw.cl.category; 
public class Result{
    public boolean active;
    public String categoryCode;
    public String categoryName;
    public String entityName;
    public String entityTypeCode;
    public boolean systemDefined;
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getEntityName() {
		return entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	public String getEntityTypeCode() {
		return entityTypeCode;
	}
	public void setEntityTypeCode(String entityTypeCode) {
		this.entityTypeCode = entityTypeCode;
	}
	public boolean isSystemDefined() {
		return systemDefined;
	}
	public void setSystemDefined(boolean systemDefined) {
		this.systemDefined = systemDefined;
	}
    
    
}
