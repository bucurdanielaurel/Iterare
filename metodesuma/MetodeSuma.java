package com.com.exercitii.metodesuma;

/**
 * Created by andre on 7/26/2017.
 */
public class MetodeSuma {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int suma = adunare(a,b);
        System.out.println("Suma este " + suma);
        int max = max(a,b);
        System.out.println("Maximul este " + max);
        int min =min(a,b);
        System.out.println("Minimul este " + min);
        double medie = mediaArtimetica(a,b);
        System.out.println("Media aritmetica este " + medie);
    }
    // Calculeaza suma dintre 2 numere
    public static int adunare(int x, int y)
    {
        return (x+y);
    }
    //Calculeaza maximul
    public static int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    //Calculeaza minimul
    public static int min(int x, int y)
    {
        if(x<y)
            return x;
        else
            return y;
    }
    //Calculeaza media aritmetica
    public static double mediaArtimetica(int a, int b)
    {
        return (double)(a+b)/2;
    }
}
