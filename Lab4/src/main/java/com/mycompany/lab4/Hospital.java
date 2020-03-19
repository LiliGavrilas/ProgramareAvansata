/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author XPS 9530
 */
public class Hospital implements Comparable{
    Integer id;
    List<Resident> residents =new ArrayList <Resident>();



    public Hospital(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
       
    }

    public List<Resident> getResidents() {
        return residents;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResidents(List<Resident> residents) {
        this.residents = residents;
    }
   
    public void addResident(Resident r)
    {
        residents.add(r);
    }

    @Override
    public int compareTo(Object o) {
       if(o.getClass() == Hospital.class)
       {
           Hospital x=(Hospital) o;
          return this.id.compareTo(x.id);
       }
       return 0;
    }

    @Override
    public String toString() {
        String s = "[";
        for(Resident r : residents)
        {
           s = s + r.id + ',';
        }
        s = s + ']';
        return "Hospital{" + "id=" + id + ", residents=" + s + '}';
    }
    
    
    

    
    
    
    
}
