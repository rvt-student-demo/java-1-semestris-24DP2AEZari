package rvt;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int numberCounter = 0;
        while (true) {
            System.out.println("Ievadi skaitli fr: ");
            int number = Integer.valueOf(scan.nextLine());
            if (number == 0) {
                break;
            }
            numberCounter += 1;
            sum = sum + number;
        }
        System.out.println("Number of numbers: " + numberCounter);
        System.out.println("Sum of numbers: " + sum);
    }
}
