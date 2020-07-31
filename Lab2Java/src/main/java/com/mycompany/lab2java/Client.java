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
class Client {

    private int nrOrd;
    private String nume;

    public Client(int nrOrd_, String nume_) {
        nrOrd = nrOrd_;
        nume = nume_;
    }

    public void setNrOrd(int nrOrd_) {
        nrOrd = nrOrd_;
    }

    @Override
    public String toString() {
        return "Client{" + "nrOrd=" + nrOrd + ", nume=" + nume + '}';
    }

    public void setNume(String nume_) {
        nume = nume_;
    }

    public int getNrOrd() {
        return nrOrd;
    }
    
    public String getNume() {
        return nume;
    }


}
