package rvt;
import java.util.*;
public class advancedAstrology {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("how big tree brotato");
        int input = Integer.valueOf(reader.nextLine());

        xmasTree(input);
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i);
            System.out.println();
        }
        }
    public static void xmasTree(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size-i);
            printStars(i * 2 - 1);
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            printSpaces(size-2);
            printStars(3);
            System.out.println();
        }
        }


}
   