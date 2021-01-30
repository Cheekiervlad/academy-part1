package by.academy.classwork.lesson6;

//5. Дана строка:
//" Hey      There!     How      Are you doing"   ;
//оставить лишь 1 пробел между слов.

public class Task5 {
    public static void main(String[] args) {
        String text = " Hey      There!     How      Are you doing ";
        System.out.println(text.replaceAll("\\s+", " ").trim());
    }
}
