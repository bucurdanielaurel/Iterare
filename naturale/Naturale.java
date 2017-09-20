package com.com.exercitii.naturale;

import java.util.Scanner;

/**
 * Created by andre on 7/12/2017.
 */
public class Naturale {
    public static void main(String[] args) {
        System.out.print("Numarul 1: ");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        System.out.print("Numarul 2: ");
        int b = reader.nextInt();
        System.out.print("Numarul 3: ");
        int c = reader.nextInt();

        int max;
        if ((a>b) && (a>c))
        System.out.println(a);
        else if((b>a) && (b>c))
        System.out.println(b);
        else
        System.out.println(c);

        /* if (a>b) && (a>c)
        System.out.println(a);
        else
        if(b>a) && (b>c)
        System.out.println(b);
        else
        System.out.println(c);
         */

        //System.out.println(max);
    }
}

