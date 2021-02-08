package by.academy.tasks.oop.task4;

import java.time.LocalDate;
import java.util.Arrays;

public class Reader {
    private String fullName;
    private long numberOfLibraryCard;
    private String faculty;
    private LocalDate dateOfBirth;
    private String numberPhone;

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.takeBook("Приключения", "Словарь");
        reader.returnBook("Приключения", "Словарь");
        reader.takeBook(new Book("Приключения", "Керч"), new Book("Словарь", "Корч"));
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... nameOfBooks) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(nameOfBooks));
    }

    public void takeBook(Book... books) {
        String[] booksName = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            booksName[i] = books[i].getName();
        }
        System.out.println(fullName + " взял книги: " + Arrays.toString(booksName));
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... nameOfBooks) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(nameOfBooks));
    }
}
