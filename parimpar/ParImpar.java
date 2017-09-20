package com.com.exercitii.parimpar;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Scrie un numar");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        if (numar%2 == 0)
            System.out.println("Numarul este par");
        else
            System.out.println("Numarul este impar");
    }
}
