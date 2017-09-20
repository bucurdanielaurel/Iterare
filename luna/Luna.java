package com.com.exercitii.luna;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class Luna {
    public static void main(String[] args) {
        System.out.print("Dati un numar de la 1 la 12: ");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        String luna = " ";
        switch (numar) {
            case 1:
                luna = "Ianuarie";
                break;
            case 2:
                luna = "Februarie";
                break;
            case 3:
                luna = "Martie";
                break;
            case 4:
                luna = "Aprilie";
                break;
            case 5:
                luna = "Mai";
                break;
            case 6:
                luna = "Iunie";
                break;
            case 7:
                luna = "Iulie";
                break;
            case 8:
                luna = "August";
                break;
            case 9:
                luna = "Septembrie";
                break;
            case 10:
                luna = "Octombrie";
                break;
            case 11:
                luna = "Noiembrie";
                break;
            case 12:
                luna = "Decembrie";
                break;
            default:
                System.out.println("S-au terminat lunile din an!");
        }
        System.out.println(luna);
    }
}
