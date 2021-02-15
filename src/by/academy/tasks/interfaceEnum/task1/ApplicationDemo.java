package by.academy.tasks.interfaceEnum.task1;

public class ApplicationDemo {

    public static void main(String[] args) {
        Printable[] printableArray = {new Book(), new Magazine(), new Book(), new Book(), new Magazine()};
        for (Printable printable : printableArray) {
            printable.print();
        }

        Book.printBooks(printableArray);
        Magazine.printMagazines(printableArray);
    }
}
