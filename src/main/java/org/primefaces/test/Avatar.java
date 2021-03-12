package org.primefaces.test;

import java.io.Serializable;

public class Avatar implements Serializable {

	 
	private int id;    
    private String displayName; 
    private String url;
     
    public Avatar() {}
 
    public Avatar(int id, String displayName, String url) {
        this.id = id;
        this.displayName = displayName;
        this.url = url;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getDisplayName() {
        return displayName;
    }
 
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
 
    
     
    @Override
    public String toString() {
        return url;
    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
 

 
}
