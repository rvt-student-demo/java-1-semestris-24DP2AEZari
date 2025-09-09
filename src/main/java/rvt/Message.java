package rvt;
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write a message: ");
        String message = reader.nextLine();
        System.out.println(message);
    }
}
