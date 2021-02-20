package by.academy.classwork.lesson12.task3;

//3.	Переписать класс Query используя статический класс.

public class Task1 {

    public static void main(String[] args) {
        User user = new User();
        User.Query q = new User.Query(user);
    }

}
