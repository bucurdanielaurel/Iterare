package com.com.exercitii.panalanumar;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class PanaLaNumar {
    public static void main(String[] args) {
        System.out.print("Dati un numar: ");
        Scanner scanner = new Scanner (System.in);
        int numar = scanner.nextInt();
        for (int i=1; i <= numar; i++)
            System.out.print(i + " ");
    }
}
