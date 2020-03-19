/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XPS 9530
 */
public class KnapsackGenerator {

    public List<Object> getRandomKnapsack() {
        List<Item> items = new ArrayList();
        int randomLength = (int) (Math.random() * 1_000_000) % 200;
        Double randomCapacity=Math.random() * 1_000;
        
        for (int i = 0; i < randomLength; i++) {
                    double randomNumber = Math.random();
            if (randomNumber < 0.33) {
                Book b = new Book();
                b.setBookName("");
                b.setPageNumber((int) (Math.random() * 1_000_000)%1000);
                b.setValue(Math.random() * 1_000);
                items.add(b);
            } else if (randomNumber < 0.66) {
                Food f = new Food();
                f.setNameFood("");
                f.setWeightFood(Math.random() * 500);
                items.add(f);

            } else {
                Weapon w = new Weapon();
                w.setWeaponType(WeaponType.Weapon1);///TODO
                w.setWeaponValue(Math.random() * 1_000);
                w.setWeaponWeight(Math.random() * 500);
                items.add(w);
            }
        }
        List<Object> res=new ArrayList<Object>();
        res.add(items);
        res.add(randomCapacity);
        return res;
    }
    
}
