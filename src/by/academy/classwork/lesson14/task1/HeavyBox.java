package by.academy.classwork.lesson14.task1;

import java.util.Objects;

public class HeavyBox extends Box implements Comparable {
    int weight;

    public HeavyBox() {

    }

    public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeavyBox{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", depth=").append(depth);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public int compareTo(Object o) {
        HeavyBox o2 = (HeavyBox) o;
        return getWeight() - o2.getWeight();
    }
}
