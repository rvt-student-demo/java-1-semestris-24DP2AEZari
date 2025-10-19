package rvt;
import java.util.*;
public class breakAndRemember {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter smth fr: ");
        while (true){
            int numbers = Integer.valueOf(scan.nextLine());
            if (numbers % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            if (numbers == -1) {
                System.out.println("Thx bai >,<");
                System.out.println("Sum: "+ sum);
                System.out.println("Numbers: " + counter);
                avg = sum / Double.valueOf(counter);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;   
            } else {
                sum += numbers;
                counter++;
            }
            

        }
    }   
}
