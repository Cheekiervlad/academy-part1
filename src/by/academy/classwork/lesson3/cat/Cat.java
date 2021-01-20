package by.academy.classwork.lesson3.cat;

public class Cat {
    int age;
    String nickname;
    int mooney;
    private char initial;
    private boolean isHomeAnimal;

    public Cat() {
        super();
    }

    public Cat(String nickname) {
        super();
        this.nickname = nickname;
    }

    public void grow() {
        age ++;
    }

    public void sleep() {
        System.out.println("Sleep");
    }

    public void eat() {
        System.out.println("Eat");
    }

    public void walk() {
        System.out.println("Walk");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", nickname='" + nickname + '\'' +
                ", mooney=" + mooney +
                ", initial=" + initial +
                ", isHomeAnimal=" + isHomeAnimal +
                '}';
    }
}
