package rvt;
import java.util.*;
public class JMArrayList {
    public static void main(String[] args){
        listSize();
    }
    public static void onlyTheseNums() {
        ArrayList<Integer> numList = new ArrayList<>();
        Scanner numbers = new Scanner(System.in);
        System.out.println("enter nums: ");
        while (true) {
            int nums = Integer.valueOf(numbers.nextLine());
            numList.add(nums);
            if (nums == -1) {
                numList.remove(numList.size()-1);
                System.out.println("From where? ");
                int fromWhere = Integer.valueOf(numbers.nextLine());
                System.out.println("To where? ");
                int toWhere = Integer.valueOf(numbers.nextLine());
                for (;fromWhere < toWhere;) {
                    System.out.println(numList.get(fromWhere));
                    fromWhere++;
                }
                break;
            }
        }
    }

    public static void listSize() {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter names: ");
        while (true) {
            String name = scanner.nextLine();
            names.add(name);
            if (name == ""){
                names.remove(names.size()-1);
                System.out.println("There are "+ names.size() + " names.");
                break;
            }
        }
    }
    public static void onTheList() {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter names: ");
        while (true) {
            String name = scanner.nextLine();
            names.add(name);
            if (name == ""){
                names.remove(names.size()-1);
                System.out.println("What name to find? ");
                String findName = scanner.nextLine();
                if 
                break;
            }
        }
    }
}
