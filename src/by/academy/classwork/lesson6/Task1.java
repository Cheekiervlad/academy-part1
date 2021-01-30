package by.academy.classwork.lesson6;

//1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String text = "2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, +" +
                " что слова могут разделяться несколькими пробелами, в начале и конце текста также могут +" +
                " быть пробелы, но могут и отсутствовать.";
        String regex = "[.,!?;]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()){
            counter ++;
            System.out.print(text.substring(matcher.start(), matcher.end()));
        }
        System.out.println();
        System.out.println(counter);
    }
}
