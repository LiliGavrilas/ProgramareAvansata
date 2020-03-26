/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XPS 9530
 */
public class Catalog implements Serializable {
 private String name;
 private String path;//calea catre catalog path sau URL
 private List<Document> documents = new ArrayList<>();

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public Catalog(String name_) {
        name=name_;
        this.path="./Default.txt";
    }
    

    //...
    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public List<Document> getDocuments() {
        return documents;
    }
    
    
    
    //...

    public void setName(String name) {
        this.name = name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    
    
    

 
 //…
 public void add(Document doc) {
    documents.add(doc);
 }
 /*public Document findById(int id) {
      return documents.get(id);////documents[id]
 }*///documentul de pe pozitia  id
 
 
 public Document findById(String id) {
 return documents.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
 }

}
