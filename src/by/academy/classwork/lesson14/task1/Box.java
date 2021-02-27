package by.academy.classwork.lesson14.task1;

public class Box {
    double width;
    double height;
    double depth;

    public Box() {
        System.out.println("Конструирование объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
