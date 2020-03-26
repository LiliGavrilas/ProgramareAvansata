/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author XPS 9530
 */
public class CatalogUtil {

    public static void save(Catalog catalog) throws FileNotFoundException, IOException///scrierea pe disc--->output-->
    {
        FileOutputStream fos = new FileOutputStream (catalog.getPath());///open
        ObjectOutputStream oos = new ObjectOutputStream (fos); ///flux pt serealizare/deseria
        
        oos.writeObject(catalog);////am serelizat catalogul
        oos.close();////inchid
        fos.close();
    }
    
    /*public static void save(Catalog catalog)
            throws IOException {
        try ( var oos = new ObjectOutputStream(///un flux de biti care reprezinta un obj
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        } catch (IOException e) {
            System.err.println(e);
        }

    }*/

    public static Catalog load(String path) throws FileNotFoundException, IOException, ClassNotFoundException{///citim de pe disc-->input
     
            FileInputStream fis =new FileInputStream(path); ///open 
            ObjectInputStream ois =new ObjectInputStream(fis);///dam deschis un flux care poate deserializa
           Catalog c = (Catalog) ois.readObject();///am citit obj de tip catalog de la locatia path
           fis.close();
           ois.close();
           return c;
    }
    
    public static void view (Catalog c, String id) throws URISyntaxException, IOException
    {
        Desktop ds = Desktop.getDesktop();
        Document d =c.findById(id);
        if(d.getLocation().startsWith("http"))
        {
            
            ds.browse(new URI (d.getLocation()));
        }
        else
        {
            ds.open(new File (d.getLocation()));
        }
        
    }
    
}
