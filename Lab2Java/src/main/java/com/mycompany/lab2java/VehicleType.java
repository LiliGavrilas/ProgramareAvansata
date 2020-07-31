/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2java;

/**
 *
 * @author XPS 9530
 */
public enum VehicleType {
    CAR, TRUCK, DRONE;///container de define-ere SAU tip de data distcreta
}

class Vehicle {//gett set 2constructori

    private Depot depot;
    private Tour tour;
    private VehicleType vehicleType;

    public Vehicle(Depot depot_, VehicleType vehicleType_) {
        vehicleType = vehicleType_;
        depot = depot_;
        tour = null;
        //depot.addNewVehicle(this);
      
    }

    public Vehicle(Depot depot_, VehicleType vehicleType_ , Tour tour_) {
        vehicleType = vehicleType_;
        depot = depot_;
        tour = tour_;
    }

    public Tour getTour() {
        return tour;
    }

    public VehicleType geVehicleType() {
        return vehicleType;
    }

    public Depot getDepot() {
        return depot;
    }

    public void setTour(Tour tour_) {
        tour = tour_;
    }

    public void setTypeVehicle(VehicleType vehicleType_) {
        vehicleType = vehicleType_;
    }

    public void setDepot(Depot depot_) {
        depot = depot_;
    }

    public void addNewVehicle(Vehicle vehicle) {
        depot.addNewVehicle(this);
    }

    public void removeVehicle(int vehicle) {
        depot.removeVehicleByIndex(vehicle);
    }

    public void Vehicle(int vehicle) {
        depot.getVehicleByIndex(vehicle);
    }

}
