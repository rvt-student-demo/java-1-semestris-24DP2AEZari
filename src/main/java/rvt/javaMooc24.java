package rvt;

public class javaMooc24 {
    public static void main(String[] args) {
        divisibleByThreeInRange(1, 21);

    }
    public static void printUntilNumber(int number){
        for (int counter = 1; counter<=number; counter++) {
            System.out.println(counter);
        }
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (; beginning<=end; beginning++){
            if (beginning%3==0){
                System.out.println(beginning);
            }
        }
    }
}
