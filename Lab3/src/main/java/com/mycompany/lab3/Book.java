/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

/**
 *
 * @author XPS 9530
 */
public class Book implements Item{
    private String name;
    private int pageNumber; //→ getWeight
    private double value;

    public Book (String name_, int pageNumber_,double value_)
    {
        name=name_;
        pageNumber=pageNumber_;
        value=value_;
    }
    public Book (String name_, int pageNumber_)
    {
        name=name_;
        pageNumber=pageNumber_;
        value=0;
    
    }
    public Book ()
    {
        name="";
        pageNumber=0;
        value=0;
    }
    public void setBookName(String name_)
    {
      name=name_;  
    }
 
     public void setPageNumber(int pageNumber_)
    {
      pageNumber=pageNumber_;  
    }
   
     public void setValue(double value_)
    {
      value=value_;  
    }
    
    public Double getValue()
    {
        return value; 
    }

    @Override
    public String getName() {
        return name; 
    }

    @Override
    public Double getWeight() {
        return (double)pageNumber/100; 
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", pageNumber=" + pageNumber + ", value=" + value + '}';
    }

    @Override
    public double profitFactor() {
        return Item.super.profitFactor(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
