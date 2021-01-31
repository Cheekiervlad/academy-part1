package by.academy.tasks.regExp;

//3.Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов

public class Task3 {
    public static void main(String[] args) {
        String text = "Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть," +
                " что слова могут разделяться несколькими пробелами, в начале и конце текста также могут" +
                " быть пробелы, но могут и отсутствовать.";
        text = text.replaceAll("[!.,:;-]", "");
        String[] worlds = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : worlds) {
            stringBuilder.append(word.charAt(word.length() - 1));
        }
        System.out.println(stringBuilder);
    }
}
