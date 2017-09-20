package com.com.exercitii.nota;

import java.util.Scanner;

/**
 * Created by andre on 7/19/2017.
 */
public class Nota {
    public static void main(String[] args) {
        System.out.println("Ce nota ati luat?");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        switch (nota)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Mai incearca!"); break;
            case 5:
                System.out.println("Ai trecut."); break;
            case 6:
            case 7:
                System.out.println("E bine, keep going!"); break;
            case 8:
            case 9:
                System.out.println("Bravo, good job!"); break;
            case 10:
                System.out.println("Congrats, esti tare!"); break;
            default:
                System.out.println("Nota nu exista.");

        }
    }
}
