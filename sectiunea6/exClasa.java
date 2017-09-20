package com.com.exercitii.sectiunea6;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class exClasa {
    public static void main(String[] args) {
        System.out.println("Scrieti un numar intre 1 si 7");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        String ziua = " ";
        switch (numar)
        {
            case 1: ziua = "Luni"; break;
            case 2: ziua = "Marti"; break;
            case 3: ziua = "Miercuri"; break;
            case 4: ziua = "Joi"; break;
            case 5: ziua = "Vineri"; break;
            case 6: ziua = "Sambata"; break;
            case 7: ziua = "Duminica"; break;
            default:
                System.out.println("Numarul nu e valabil");
        }
       System.out.println(ziua);
    }
}
