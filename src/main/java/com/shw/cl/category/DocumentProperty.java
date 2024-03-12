package com.shw.cl.category; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class DocumentProperty{
    @JsonProperty("DocumentCategories") 
    public DocumentCategories documentCategories;

	public DocumentCategories getDocumentCategories() {
		return documentCategories;
	}

	public void setDocumentCategories(DocumentCategories documentCategories) {
		this.documentCategories = documentCategories;
	}
    
    
}
