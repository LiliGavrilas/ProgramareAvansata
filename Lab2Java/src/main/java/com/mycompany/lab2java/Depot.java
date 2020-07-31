/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2java;

import java.util.List;

/**
 *
 * @author XPS 9530
 */
public class Depot {

    private List<Vehicle> vehicles;
    private String numeDepot;

    public Depot(List<Vehicle> vehicles_, String numeDepot_) {
        vehicles = vehicles_;
        numeDepot = numeDepot_;
    }

    public Depot(String numeDepot_) {
        vehicles = null;
        numeDepot = numeDepot_;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles_) {
        vehicles = vehicles_;
    }

    public String getNumeDepot() {
        return numeDepot;
    }

    public void setNumeDepot(String numeDepot_) {
        numeDepot = numeDepot_;
    }

   
    public void addNewVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void removeVehicleByIndex(int index) {
        try {
            vehicles.remove(index);
        }
        catch (Throwable o) {
            System.out.println("Invalid index");
        }
    }

    public Vehicle getVehicleByIndex(int index) {
        try{
           return  vehicles.get(index);
        }catch(Throwable o)
        {
            System.out.println("invalid index");
            return null;
        }
    }
}
