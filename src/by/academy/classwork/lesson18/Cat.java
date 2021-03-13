package by.academy.classwork.lesson18;

@Description(age = 10, name = "Cat")
public class Cat {
    public int age;
    protected String name;
    private int id;

    public Cat(int id){
       this.id = id;
    }

    public void alala() {
        System.out.println("alala");
    }

    protected void alala(int a) {
        System.out.println("alala" + a);
    }

    private void alala(String a) {
        System.out.println("alala" + a);
    }
}
