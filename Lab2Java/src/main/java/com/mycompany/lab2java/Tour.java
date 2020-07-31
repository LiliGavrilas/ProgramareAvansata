/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author XPS 9530
 */
class Tour {

    private Vehicle responsableVehicle;
    private List<Client> clients= new ArrayList <>();

    public Tour(Vehicle responsableVehicle_, List<Client> clients_) {
        responsableVehicle = responsableVehicle_;
        clients = clients_;

    }

    @Override
    public String toString() {
        return "Tour{" + "responsableVehicle=" + responsableVehicle + ", clients=" + clients + '}';
    }

    public Tour(Vehicle responsableVehicle_) {
        responsableVehicle = responsableVehicle_;
        //clients = new ListImpl();
    }

    public void setVehicle(Vehicle v) {
        responsableVehicle = v;
    }

    public void setClients(List<Client> c) {
        clients = c;
    }

    public Vehicle getResponsabeVehicle() {
        return responsableVehicle;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addClient(Client c) {
        clients.add(c);
    }

    public void removeClientByIndex(int index) {
        try {
            clients.remove(index);
        } catch (Throwable o) {
            System.out.println("Invalid index");
        }

    }

    public Client getClientByIndex(int index) {
        try {
            return clients.get(index);
        } catch (Throwable o) {
            System.out.println("invalid index");
            return null;
        }
       
    }

    public void printTours() {
        System.out.println("Tour =");
        for (int i = 0; i < this.clients.size(); i++) {
            System.out.print("El din tour =" + this.clients.get(i));
        }
    }


}
