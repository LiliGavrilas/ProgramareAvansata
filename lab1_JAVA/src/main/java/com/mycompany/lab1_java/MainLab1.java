/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1_java;

import static java.lang.System.exit;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author XPS 9530 ElenaCalmis
 */
public class MainLab1 {

    public static String getRandomWord(int wordLeng, char[] alfabet) {
        String word = "";
        for (int i = 0; i < wordLeng; i++) {
            int r = (int) (Math.random() * 1_000_000) % alfabet.length;
            word = word + alfabet[r];
        }
        return word;

    }

    public static Boolean adjacentWords(String leftWord, String rightWord) {
        for (int i = 0; i < leftWord.length(); i++) {
            for (int j = 0; j < rightWord.length(); j++) {
                if (leftWord.charAt(i) == rightWord.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int n, k, m;

        if (args.length < 3) {
            System.out.println("arg insuficiente");
            exit(1);
        }

        n = Integer.parseInt(args[0]);
        k = Integer.parseInt(args[1]);
        m = args.length - 2;

        char[] alfabet = new char[m];

        for (int i = 2; i < args.length; i++) {
            alfabet[i - 2] = args[i].charAt(0);
            if (args[i].length() != 1) {
                System.out.println("err");
                exit(2);
            }
        }

        System.out.println(getRandomWord(k, alfabet));
        //System.out.println(getRandomWord(k, alfabet));

        String[] randomWords = new String[n];
        for (int i = 0; i < n; i++) {
            randomWords[i] = getRandomWord(k, alfabet);
            System.out.println(randomWords[i]);
        }
        boolean matAd[][] = new boolean[n][n];;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matAd[i][j] = adjacentWords(randomWords[i], randomWords[j]);
                if (i == j) {
                    matAd[i][j] = false;
                }
            }
        }
       /* System.out.println("Matricea de adiacenta este: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matAd[i][j] + " ");
            }
            System.out.println("");
        }*/
        int veciniMax = 0;
        int cuvCuNrMaxVecini = 0;
        for (int i = 0; i < n; i++) {
            int nrVecini = 0;
            for (int j = 0; j < n; j++) {
                if (matAd[i][j]) {
                    nrVecini++;
                }

            }
            if (nrVecini > veciniMax) {
                veciniMax = nrVecini;
                cuvCuNrMaxVecini = i;
            }
        }
        System.out.println("cuvantul cu nr max de vecini este :" + randomWords[cuvCuNrMaxVecini] + " si are " + veciniMax + " vecini");

        int nrVeciniEgali = 1;
        for (int i = 0; i < n; i++) {
            int nrVecini = 0;
            for (int j = 0; j < n; j++) {
                if (matAd[i][j]) {
                    nrVecini++;
                }

            }
            if (nrVecini < veciniMax) {
                nrVeciniEgali = 0;
            }
        }
        System.out.println("toate cuvintele au nr de vecini egali " + nrVeciniEgali);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;

        if (n > 50) {
            System.out.println(totalTime);
        } else {
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    if (matAd[i][j] == true) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
        }
       
    }

}
