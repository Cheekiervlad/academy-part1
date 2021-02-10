package by.academy.classwork.lesson9;

public class Tree extends Plant {

    @Override
    public void grows(Plant tree) {
        tree.setAge(tree.getAge() + 1);
    }
}
