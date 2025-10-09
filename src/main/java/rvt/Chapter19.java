package rvt;
    import java.util.Scanner;
public class Chapter19 {
    public static void main(String[] args) {
        ex4();
    }
    public static void ex1() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter start!");
        int skaitlis = reader.nextInt();
        System.out.println("Enter end!");
        int skaitlis2 = reader.nextInt();
        System.out.println();
        while (skaitlis <= skaitlis2) {
            System.out.println(skaitlis);
            skaitlis++;
        }
    }
    public static void ex2() {
        int counter = 1;
        int sum = 0;
        int sum2 = 0;
        System.out.println("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());
        while (counter <= N) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Formula sum = " + (N*(N+1))/2);


    }
    public static void ex3() {
        int sum = 0;
        int counter = 1;
        System.out.println("Enter N:");
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());
        while (counter <= N) {
            sum += counter * counter; 
            counter++;

        }
        System.out.println("Sum = "+sum);
        System.out.println("Formula sum " + (N*(N+1)*(2*N+1))/6);
        System.out.println("Formula sum " + ( (N*(N+1))/2 )*( (N*(N+1))/2 ));

    }
    public static void ex4() {
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a low!");
        int skaitlis = Integer.valueOf(reader.nextLine());
        System.out.println("Enter a high!");
        int N = Integer.valueOf(reader.nextLine());
        while (skaitlis <= N) {
            sum = sum + skaitlis;
            skaitlis++;
        }
        System.out.println("Sum = " + sum);
        System.out.println("sum = " + ((N*(N+1))/2 - ((skaitlis - 1)*skaitlis)/2));

    }
   }
