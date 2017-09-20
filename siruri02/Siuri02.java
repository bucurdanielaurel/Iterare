package com.com.exercitii.siruri02;

/**
 * Created by x on 02-Aug-17.
 */
public class Siuri02 {
    public static void main(String[] args) {
        int[] a = {23, 1, 34, 54, 3, 7, 5, 12, 15, 8};
        //Afisare nr pare din sir
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }
    }
}