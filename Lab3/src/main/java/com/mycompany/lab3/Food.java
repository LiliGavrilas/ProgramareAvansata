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
public class Food implements Item {

    private String name;
    private double weight; // → getWeight, getValue
//...

    Food() {
        name="";
        weight=0;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", weight=" + weight + '}';
    }

    public Food(String name_, double weight_) {
        name = name_;
        weight = weight_;
    }

    public Food(double weight_) {
        name = "";
        weight = weight_;

    }

    public String getNameFood() {
        return name;

    }

    public double getWeightFood() {
        return weight;

    }

    public void setNameFood(String name_) {
        name = name_;
    }

    public void setWeightFood(double weight_) {
        weight = weight_;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getValue() {
       return 2*this.weight;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }
}
