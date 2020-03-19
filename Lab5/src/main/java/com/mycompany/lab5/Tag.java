/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author XPS 9530
 */
public class Tag {
    
    private String name;
    private String value;

    public Tag() {
    }

    public Tag(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addTag(Tag t) {
        t.addTag(t);
    }
    
    public void removeTag(Tag t)
    {
        t.removeTag(t);
    }

    
}
