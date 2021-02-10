package by.academy.classwork.lesson9;

public class ChristmasTree extends Tree {

    @Override
    public void grows(Plant tree) {
        tree.setAge(tree.getAge() + 1);
    }
}
