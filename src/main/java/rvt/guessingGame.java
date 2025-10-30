package rvt;
import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guesses = 3;
        int randomNum = random.nextInt(10) + 1;
        System.out.println("Es dom?ju par skaitli no 1 l?dz 10.");
        System.out.println("Tev tas j?uzmin tr?s m??in?jumos.");
        System.out.println("Ievadi min?jumu:");
        for (int i = 0; i < 3; i++){
            int skaitlisGuess = scanner.nextInt();
            if (skaitlisGuess == randomNum) {
                System.out.println("PAREIZI!!");
                break;
            } else {
                System.out.println("nepareizi :(");
            }
            
        }
        System.out.println("Pareizais skaitlis bija " + randomNum);
        


    }

    
}
