/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author XPS 9530
 */
public class Greedy implements Algorithm
{
    
      @Override
      public Knapsack solveProblem(List<Item> items,  double maxCapacity)
      {
          Knapsack k=new Knapsack(maxCapacity);
          
          Comparator<? super Item> c = new Comparator<Item>() {
              @Override
              public int compare(Item o1, Item o2) {
                  return o1.getWeight().compareTo(o2.getWeight());
              }
          };
          
          items.sort(c);
          
          for(int i=0;i<items.size();i++)
          {
              k.addItem(items.get(i));
          }
          
          return k;
      }
}
