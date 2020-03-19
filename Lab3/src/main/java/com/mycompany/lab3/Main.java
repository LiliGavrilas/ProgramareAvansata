/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author XPS 9530
 */
/*capacity of the knapsack = 10
  available items:
     book1: Dragon Rising, weight = 3, value = 5 (profit factor = 1.66)
     book2: A Blade in the Dark, weight = 3, value = 5
     food1: Cabbage, weight = 2, value = 4 (profit factor = 2)
     food2: Rabbit, weight = 2, value = 4
     weapon: Sword, weight = 5, value = 10 (profit factor = 2)
  selected items: weapon, book1, food1 (total weight=10, total value=19)*/
public class Main {

    public static void main(String args[]) {
        Item book1 = new Book("Dragon Rising", 300, 5);
        Item book2 = new Book("A Blade in the Dark", 300, 5);
        Item food1 = new Food("Cabbage ", 2);
        Item food2 = new Food("Rabbit ", 2);
        Item weapon = new Weapon(WeaponType.Weapon1, 15, 10);
        
        Knapsack k =new Knapsack(10);
        k.addItem(weapon);
        k.addItem(food1);
        k.addItem(book1);
        System.out.println(k);
        
        
        System.out.println("------------------");
        Algorithm g=new Greedy();
        List<Item> items = new LinkedList();
        items.add(book1);
        items.add(book2);
        items.add(food1);
        items.add(food2);
        items.add(weapon);
        System.out.println(g.solveProblem(items, 10));
        
        
        
        KnapsackGenerator kg=new KnapsackGenerator();
        
        System.out.println("random :" +kg.getRandomKnapsack());
        
    }
    
    
}
