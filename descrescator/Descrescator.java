package com.com.exercitii.descrescator;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class Descrescator {
    public static void main(String[] args) {
        System.out.print("Numar: ");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        for (int i = numar; i >= 1; i--)
            System.out.print(i + " ");
    }
}
