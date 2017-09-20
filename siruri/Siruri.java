package com.com.exercitii.siruri;

/**
 * Created by andre on 7/26/2017.
 */
public class Siruri {
    public static void main(String[] args) {
        int[] a = {23, 1, 34, 54, 3, 7, 5, 12, 15, 8};
        // Calcul suma
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        System.out.println("Suma este " + suma);
        //Calcul maxim din sir
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i])
                max = a[i];
        }
        System.out.println("Numarul maxim este " + max);
        //Calcul minim din sir
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
        }
        System.out.println("Numarul minim este " + min);
        //Calcul medie aritmetica
        double suma1 = 0; //folosim suma calculata anterior
        double medie = 0; // double medie = (double)suma/s.length; - suma a fost initial definita int, aici definim provizoriu
        for (int i = 0; i < a.length; i++) {
            suma1 = suma1 + a[i];
            medie = suma1 / a.length;
        }
        System.out.println("Media aritmetica a sirului este  " + medie);
    }
}


