package by.academy.classwork.lesson18;

@Description(age = 10, name = "Tiger")
public class Tiger extends Cat{
    public int ageTiger;
    protected String nameTiger;
    private int idTiger;

    public Tiger(int id){
        super(id);
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

    private void run() {
        System.out.println("running");
    }
}
