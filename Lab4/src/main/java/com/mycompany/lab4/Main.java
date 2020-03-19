/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author XPS 9530
 */
public class Main {

    public static void main(String args[]) {

        /*Residents preferences
R0: (H0, H1, H2)
R1: (H0, H1, H2)
R2: (H0, H1)
R3: (H0, H2)
Hospitals preferences
H0: (R3, R0, R1, R2)
H1: (R0, R2, R1)
H2: (R0, R1, R3)
A solution for this example might be: [(R0:H1),(R1:H2),(R2:H1),(R3:H0)]*/
        Resident r0 = new Resident(0);
        Resident r1 = new Resident(1);
        Resident r2 = new Resident(2);
        Resident r3 = new Resident(3);

        Hospital h0 = new Hospital(0);
        Hospital h1 = new Hospital(1);
        Hospital h2 = new Hospital(2);

        r0.addHospital(h0);
        r0.addHospital(h1);
        r0.addHospital(h2);

        r1.addHospital(h0);
        r1.addHospital(h1);
        r1.addHospital(h2);

        r2.addHospital(h0);
        r2.addHospital(h1);

        r3.addHospital(h0);
        r3.addHospital(h2);

        h0.addResident(r3);
        h0.addResident(r0);
        h0.addResident(r1);
        h0.addResident(r2);

        h1.addResident(r0);
        h1.addResident(r1);
        h1.addResident(r2);

        h2.addResident(r0);
        h2.addResident(r1);
        h2.addResident(r3);

        //3
        List<Resident> residents = new ArrayList<>();
        residents.add(r0);
        residents.add(r1);
        residents.add(r2);
        residents.add(r3);

        Comparator<? super Resident> c = new Comparator<>() {
            @Override
            public int compare(Resident o1, Resident o2) {
                return o1.id.compareTo(o2.id);
            }

        };

        residents.sort(c);

        //4
        Set<Hospital> hospitals = new TreeSet<>();
        hospitals.add(h0);
        hospitals.add(h1);
        hospitals.add(h2);

        //5
        Map m0 = new HashMap<Resident, List<Hospital>>();
        m0.put(r0, r0.hospitalsPreferences);
        m0.put(r1, r1.hospitalsPreferences);
        m0.put(r2, r2.hospitalsPreferences);
        m0.put(r3, r3.hospitalsPreferences);

        System.out.println(m0);

//Hashtable
        Map m1 = new Hashtable<Resident, List<Hospital>>();
    

    m1.put (r0, r0.hospitalsPreferences);

    m1.put (r1, r1.hospitalsPreferences);

    m1.put (r2, r2.hospitalsPreferences);

    m1.put (r3, r3.hospitalsPreferences);
    
        System.out.println(m1);
        
        
        ///6
       
        
        System.out.println(Arrays.toString(residents.stream().filter(e -> e.getHospitalsPreferences().contains(h0) && e.getHospitalsPreferences().contains(h2)).toArray()));
        System.out.println(Arrays.toString(hospitals.stream().filter(e-> e.getResidents().contains(r0)).toArray()));
    }
    
}
