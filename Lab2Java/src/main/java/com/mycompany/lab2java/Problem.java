/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2java;

/**
 *
 * @author XPS 9530 Elena Calmis
 */
public class Problem {

    public static void main(String[] args) {
        Depot d1 = new Depot("D1");
        Depot d2 = new Depot("D2");

        Vehicle v1 = new Vehicle(d1, VehicleType.CAR);
        Vehicle v2 = new Vehicle(d1, VehicleType.TRUCK);
        Vehicle v3 = new Vehicle(d2, VehicleType.DRONE);

        Client C1 = new Client(1, "c1");
        Client C2 = new Client(1, "c2");
        Client C3 = new Client(2, "c3");
        Client C4 = new Client(2, "c4");
        Client C5 = new Client(3, "c5");

        Tour T1 = new Tour(v1);
        Tour T2 = new Tour(v2);
        Tour T3 = new Tour(v3);
        T1.addClient(C1);
        T1.addClient(C3);
        T1.addClient(C5);
        T2.addClient(C2);
        T3.addClient(C4);
        
        System.out.println(T1);

    }

}
