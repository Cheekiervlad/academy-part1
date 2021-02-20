package by.academy.classwork.lesson12.task3;

public class User {
    private String login;
    private String password;

    public void createQuery() {
        Query query = new User.Query(this);
        query.printToLog();
    }

    public static class Query {
        User user;

        public Query(User user) {
            this.user = user;
        }

        public void printToLog() {
            System.out.println("Пользователь " + user.login + " " + user.password + " отправил запрос");
        }
    }
}
