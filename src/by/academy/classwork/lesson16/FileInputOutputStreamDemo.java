package by.academy.classwork.lesson16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\a.txt");
             InputStream input = new FileInputStream("src\\a.txt")) {
            char[] symbols = {'a', 'b', 'c'};

            for (char symbol : symbols) {
                // Запись каждого символа в текстовый файл
                output.write(symbol);
            }

            int size = input.available();

            for (int i = 0; i < size; i++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}