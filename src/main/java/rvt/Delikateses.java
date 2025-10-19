package rvt;
import java.util.Scanner;

public class Delikateses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegāde (0 = nē, 1 = jā): ");
        int ekspress = Integer.valueOf(scanner.nextLine());

        double piegade = 0;

        if (cena < 10) {
            piegade = 2; // parastā piegāde
        }

        if (ekspress == 1) {
            piegade = piegade + 3; // ekspress piemaksa
        }

        double kopa = cena + piegade;

        System.out.println();
        System.out.println("Rēķins:");
        System.out.println(prece + " " + cena);
        System.out.println("piegāde " + piegade);
        System.out.println("kopā " + kopa);

        scanner.close();
    
}
}
