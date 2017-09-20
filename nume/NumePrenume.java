package com.com.exercitii.nume;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class NumePrenume {
    public static void main(String[] args) {
        System.out.println("Numele:");
        Scanner scanner = new Scanner(System.in);
        String nume = scanner.next();
        System.out.println("Prenumele:");
        String nume2 = scanner.next();
        System.out.println("Buna seara, " + nume + " " + nume2 + " !");
    }
}
