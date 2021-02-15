package by.academy.tasks.interfaceEnum.task1;

public class Book implements Printable {

    @Override
    public void print() {
        System.out.println("Book");
    }

    public static void printBooks(Printable[] printable) {
        for (Printable printableOne : printable) {
            if (printableOne instanceof Book) {
                printableOne.print();
            }
        }
    }
}
