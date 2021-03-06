/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author XPS 9530
 */
public class Document implements Serializable {

    private String id;
    private String name;
    private String location;

    private Map tags = new HashMap<String, Object>();

    String getId() {
        return this.id;

    }

    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }

    public Document(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTags(Map tags) {
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Map getTags() {
        return tags;
    }
    
    ///The application will signal invalid data (duplicate names, invalid paths or URLs, etc.) or invalid commands using custom exceptions.
}
