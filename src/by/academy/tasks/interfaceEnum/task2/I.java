package by.academy.tasks.interfaceEnum.task2;

public class I {
    public static void main(String[] args) {
        Seasons season = Seasons.SUMMER;
        Seasons.seasonPrefer(season);

        for (Seasons season1 : Seasons.values()) {
            System.out.println(season1 + " со средней температурой: " + season1.getAverageTemperature());
            season1.getDescription();
        }
    }
}
