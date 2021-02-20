package by.academy.classwork.lesson12.task1;

public class User {
    private String login;
    private String password;

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь " + login + " " + password + " отправил запрос");
        }
    }
}
