package com.karn.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomRequest implements Serializable{
    private String name;
    private int id;

    public CustomRequest() {
    	
    }
  

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
}
