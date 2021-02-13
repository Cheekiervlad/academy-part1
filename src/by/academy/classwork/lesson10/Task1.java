package by.academy.classwork.lesson10;

public class Task1 {
    public static void main(String[] args) {

        DayOfWeek days = DayOfWeek.SUNDAY;

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " " + day.ordinal());
        }

        switch (days) {
            case MONDAY: {
                System.out.println("Понедельник");
                break;
            }
            case TUESDAY: {
                System.out.println("Вторник");
                break;
            }
            case WEDNESDAY: {
                System.out.println("Среда");
                break;
            }
            case THURSDAY: {
                System.out.println("Четверг");
                break;
            }
            case FRIDAY: {
                System.out.println("Пятница");
                break;
            }
            case SATURDAY: {
                System.out.println("Суббота");
                break;
            }
            case SUNDAY: {
                System.out.println("Воскресенье");
                break;
            }
            default: {
                System.out.println("Такого дня нет");
            }
        }
    }
}
