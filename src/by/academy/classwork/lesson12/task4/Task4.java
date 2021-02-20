package by.academy.classwork.lesson12.task4;

//4.	Создать анонимный класс расширяющий интерфейс Printable. Вызвать его метод print().

public class Task4 {
    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Print");
            }
        };

        printable.print();
    }
}
