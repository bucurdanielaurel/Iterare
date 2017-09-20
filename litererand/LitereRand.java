package com.com.exercitii.litererand;

/**
 * Created by andre on 7/19/2017.
 */
public class LitereRand {
    public static void main(String[] args) {
        String text = "Hello World!";
        for (int i = 0; i < text.length(); i++)
        {
           char litera = text.charAt(i);
           System.out.println(litera);
        }
    }
}
