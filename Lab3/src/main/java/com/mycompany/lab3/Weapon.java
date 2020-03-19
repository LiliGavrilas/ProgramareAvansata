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
public class Weapon implements Item {
private WeaponType weaponType;
    private double weight;
    private double value;
    //constructors

    Weapon() {
        this.weaponType=WeaponType.Weapon1;
        this.weight=0;
        this.value=0;
    }

    @Override
    public String toString() {
        return "Weapon{" + "weaponType=" + weaponType + ", weight=" + weight + ", value=" + value + '}';
    }

    
    public Weapon(WeaponType weaponType_, double weight_, double value_) {
        weaponType = weaponType_;
        weight = weight_;
        value = value_;
    }

    public Weapon(WeaponType weaponType_, double weight_) {
        weaponType = weaponType_;
        weight = weight_;
        value = 0;
    }
    //...getters and setters

    public void setWeaponType(WeaponType weaponType_) {
        weaponType = weaponType_;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponWeight(double weight_) {
        weight = weight_;
    }


    public void setWeaponValue(double value_) {
        value = value_;
    }

   

    @Override
    public String getName() {
        if (this.weaponType == WeaponType.Weapon1) {
            return "Weapon1";
        }
        else if(this.weaponType == WeaponType.Weapon2)
        {
           return "Weapon2"; 
        }
        else
        {
            return "Weapon3"; 
        }
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public Double getWeight() {
       return weight;
    }

}
