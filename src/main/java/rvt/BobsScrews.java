package rvt;

import java.util.Scanner;

public class BobsScrews {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ievadi skrūves: ");
        int skruves = Integer.valueOf(reader.nextLine());
        System.out.println("Ievadi uzgriežņus: ");
        int uzgriezni = Integer.valueOf(reader.nextLine());
        System.out.println("Ievadi paplāksnes: ");
        int paplaksnes = Integer.valueOf(reader.nextLine());
        if (!(skruves >= uzgriezni)) {
             System.out.println("Par maz skrūvju.");
        } else if (!(paplaksnes/skruves == 2)){
                System.out.println("Par maz paplākšņu.");
             } else {
                System.out.println("Viss ir oke");
             }
        System.out.println("Kopējā cena: " + (skruves*5 + paplaksnes*1 + uzgriezni*3));

        } 

    }
