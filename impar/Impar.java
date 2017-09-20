package com.com.exercitii.impar;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class Impar {
    public static void main(String[] args) {
        System.out.print("Numar ");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        for (int i = 1; i <= numar; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

