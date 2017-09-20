package com.com.exercitii.siruri02;

import java.util.Scanner;

/**
 * Created by x on 02-Aug-17.
 */
public class Joc {
    public static void main(String[] args) {
        System.out.println("Ai naufragiat pe o insula");
        String alegere = plaja();
        boolean jocActiv = true;
        while (jocActiv) {
            switch (alegere) {
                case "epava":
                    alegere = epava();
                case "coliba":
                    alegere = coliba();
                case "plaja":
                    alegere = plaja();
                    break;
                case "pierdut":
                    jocActiv = false;
                    break;
                case "castigat":
                    jocActiv = false;
                    break;

            }
        }
    }
    public static String plaja() {
        System.out.println("Ësti la dracu in praznic. La est e vaporul busit. La vest vezi o coliba. La sud ai marea");
        System.out.println("Ce alegi?");
        System.out.println("1. Mergi la est");
        System.out.println("2. Mergi la vest");
        System.out.println("3. Mergi la sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune  = "plaja";
        switch (alegere){
            case 1: optiune = "epava"; break;
            case 2: optiune = "coliba"; break;
            case 3: optiune = "pierdut";
                System.out.println("Ai intrat in mare si pa la revedere");
            break;
        }
        return optiune;
    }
    public static String epava(){
        System.out.println("Ai ajuns la vaporul tau. La vest e plaja.");
        System.out.println("Vaporul este stricat");
        System.out.println("Ce alegi?");
        System.out.println("1 Mergi la Vest");
        System.out.println("2 Repara Vaporul");
        System.out.println("3 Mergi la Sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "epava";
        switch (alegere){
            case 1: optiune ="plaja"; break;
            case 2: optiune ="castigat";
                System.out.println("Ai reusit sa repari vaporul ai castigat");
                break;
            case 3: optiune ="pierdut";
                System.out.println("Ai intrat in mare si din pacate ai iesit din joc");
                break;
        }
        return optiune;
    }
    public static String coliba(){
        System.out.println("Ai ajuns la o coiba.In spate e un mos. La est ai plaja");
        System.out.println("Ce alegi?");
        System.out.println("1. Vorbesti cu mosul");
        System.out.println("2. mergi spre est");
        System.out.println("3. Mergi spre sud");
        Scanner scanner = new Scanner(System.in);
        int alegere = scanner.nextInt();
        String optiune = "coliba";
        switch (alegere){
            case 1: optiune = "Castigat";
                System.out.println("Mosule are un vaporas pe partea opusa. Te duce la Dragnea");
                System.out.println("Ai reusit sa te intorci acasa! felicitari ");
                break;
            case 2: optiune = "plaja";break;
            case 3: optiune = "pierdut ";
                System.out.println("Ai intrat in mare si te-a papat rechinu ");
        }
        return optiune;
    }
}
