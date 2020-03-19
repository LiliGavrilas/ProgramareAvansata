/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XPS 9530
 */
public class Resident {
    Integer id;
    List<Hospital> hospitalsPreferences;

    public Resident(int id) {
        this.hospitalsPreferences = new ArrayList<>();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Hospital> getHospitalsPreferences() {
        return hospitalsPreferences;
    }

    public void setHospitalsPreferences(List<Hospital> hospitalsPreferences) {
        this.hospitalsPreferences = hospitalsPreferences;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void addHospital( Hospital h)
    {
       hospitalsPreferences.add(h);
    }
    
    @Override
    public String toString() {
        String s ="[";
        for (Hospital h : hospitalsPreferences)
        {
            s=s+ h.id + ',';
            
        }
        s=s+']';
        return "Resident{" + "id=" + id + ", hospitalsPreferences=" +  s + '}';
    }
    
    
    
    
}
