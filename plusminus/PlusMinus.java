package com.com.exercitii.plusminus;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class PlusMinus {
    public static void main(String[] args) {
        System.out.println("Scrie un numar");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        if (numar > 0)
            System.out.println("Numarul este pozitiv");
        else {
            if (numar < 0)
                System.out.println("Numarul este negativ");
            else
                System.out.println("Numarul este 0");
        }
    }
}
