package by.academy.classwork.lesson9;

public abstract class Plant {
    private int age;

    public abstract void grows(Plant tree);

    public void synthesize() {
        System.out.println("Plant synthesize");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
