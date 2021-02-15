package by.academy.tasks.interfaceEnum.task1;

public class Magazine implements Printable {

    @Override
    public void print() {
        System.out.println("Magazine");
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printableOne : printable) {
            if (printableOne instanceof Magazine) {
                printableOne.print();
            }
        }
    }
}
