/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author XPS 9530
 */
public class CatalogUtil {

    public static void save(Catalog catalog)
            throws IOException {
        try ( var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        } catch (IOException e) {
            System.err.println(e);
        }

    }

   /* public static Catalog load(String path)
            throws InvalidCatalogException {
        
        Files.list(dir)
                .filter((Path file)
                        -> file.getFileName().toString().endsWith(".pdf"))
                .forEach(System.out::println);
    }*/

}
