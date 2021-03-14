package by.academy.homework.homework6.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

    private static final String DIR = "src\\by\\academy\\homework\\homework6\\task3\\users";

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        list.add(new User("Петр", "Петрович", 20));
        list.add(new User("Иван", "Иваныч", 21));
        list.add(new User("Игорь", "Петрович", 22));
        list.add(new User("Степан", "Петрович", 23));
        list.add(new User("Владислав", "Петрович", 24));
        list.add(new User("Александр", "Петрович", 25));
        list.add(new User("Сергей", "Петрович", 26));
        list.add(new User("Дмитрий", "Петрович", 27));
        list.add(new User("Антон", "Петрович", 28));
        list.add(new User("Иван", "Петрович", 29));

        File dir = new File(DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        for (User user : list) {
            String userFileName = user.getName() + "_" + user.getSurname() + ".txt";
            File userFile = new File(dir, userFileName);

            try (ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(userFile)))) {
                output.writeObject(user);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}

