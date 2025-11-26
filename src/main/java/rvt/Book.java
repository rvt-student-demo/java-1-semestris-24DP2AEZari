package rvt;
import java.util.*;

public class Book {
    String title;
    int pages;
    int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAll() {
        return title + ", " + pages + " pages, " + year;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equals("")) {
                System.out.print("What information will be printed? ");
                String input = scanner.nextLine();

                if (input.equals("everything")) {
                    for (Book book : books) {
                        System.out.println(book.getAll());
                    }
                } else if (input.equals("names")) {
                    for (Book book : books) {
                        System.out.println(book.getTitle());
                    }
                }
                break;
            }

            System.out.print("How many pages? ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("What year is it released? ");
            int year = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(title, pages, year);
            books.add(newBook);
        }
    }
}
