package com.com.exercitii.propozitie;

import java.util.Scanner;

/**
 * Created by andre on 7/25/2017.
 */
public class Propozitie {
    public static void main(String[] args) {

        System.out.println("Scrieti o propozitie:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        System.out.println("Introduceti o litera:");
        Scanner scanner1 = new Scanner(System.in);
        char litera = scanner1.next().charAt(0);

        int counter = 0;

        for (int i = 0; i <= text.length(); i++) {
            char caracter = text.charAt(i);
            if (litera == caracter)
                counter++;
        }
        System.out.println("Litera " + litera + " apare in propozitie de " + counter + " ori");
    }
}

