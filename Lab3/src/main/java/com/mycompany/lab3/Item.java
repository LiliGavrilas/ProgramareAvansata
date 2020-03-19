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
public interface Item {

    String getName();

    Double getValue();

    Double getWeight();

    default double profitFactor() {
        return getValue() / getWeight();

    }
}
