package com.com.exercitii.consoana;

import java.util.Scanner;

/**
 * Created by andre on 7/25/2017.
 */
public class Consoana {
    public static void main(String[] args) {
        System.out.println("Introduceti o litera:");
        Scanner scanner = new Scanner(System.in);
        String litera = scanner.next();
        switch(litera)
        {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Litera este o vocala!"); break;
            default:
                System.out.println("Litera este o consoana!");
        }
    }
}
/* orice caracter introduc care nu e printre vocale il returneaza ca si consoana!*/
