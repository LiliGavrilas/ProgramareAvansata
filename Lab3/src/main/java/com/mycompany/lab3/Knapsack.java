/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author XPS 9530
 */
public class Knapsack {

    private double capacity;
    private List<Item> items = new ArrayList<>();
    //… constructors, getters, setters

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        Comparator<? super Item> c = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        
        items.sort(c);
        return "Knapsack{" + "capacity=" + capacity + ", items=" + items + '}';
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Knapsack(double capacity_) {
        capacity = capacity_;
    }

    public void addItem(Item item) {
        if(this.capacity>item.getWeight()){
        items.add(item);
        this.capacity-=item.getWeight();
        }
    }

    //… toString, etc.
}
