package com.com.exercitii.addno;

import java.util.Scanner;

/**
 * Created by andre on 7/12/2017.
 */
public class Addno {
    public static void main(String[] args) {
        // Citim 3 numere
        System.out.println("Indica primul numar: ");
        Scanner reader = new Scanner(System.in);
        int nr1 = reader.nextInt();
        System.out.println("Indica al doilea numar: ");
        int nr2 = reader.nextInt();
        System.out.println("Indica al treilea numar: ");
        int nr3 = reader.nextInt();
        // Aduna numerele
        int sum = nr1 + nr2 + nr3;

        System.out.println(sum);
    }
}
