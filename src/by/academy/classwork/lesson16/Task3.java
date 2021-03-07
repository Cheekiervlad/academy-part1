package by.academy.classwork.lesson16;

//3.Написать класс, который копирует содержимое из одного файла в другой.
//Используем классы BufferedReader, FileReader, BufferedWriter, FileWriter.

import java.io.*;

public class Task3 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src\\buffWriter.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\copyBuffWriter.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
