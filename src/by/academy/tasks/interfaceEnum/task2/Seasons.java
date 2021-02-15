package by.academy.tasks.interfaceEnum.task2;

public enum Seasons {
    WINTER("-5"),
    SUMMER("+20") {
        @Override
        void getDescription() {
            System.out.println("Тёплое время года");
        }
    },
    AUTUMN("+12"),
    SPRING("+10");
    private String averageTemperature;

    Seasons(String averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    void getDescription() {
        System.out.println("Холодное время года");
    }

    public static void seasonPrefer(Seasons season) {
        switch (season) {
            case SUMMER: {
                System.out.println("Я люблю лето");
                break;
            }
            case WINTER: {
                System.out.println("Я люблю зиму");
                break;
            }
            case AUTUMN: {
                System.out.println("Я люблю осень");
                break;
            }
            case SPRING: {
                System.out.println("Я люблю весну");
                break;
            }
        }
    }

    public String getAverageTemperature() {
        return averageTemperature;
    }

}
