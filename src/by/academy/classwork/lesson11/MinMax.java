package by.academy.classwork.lesson11;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public double min() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (Double.compare(array[i].doubleValue(), min) < 0) {
                min = array[i].doubleValue();
            }
        }
        return min;
    }

    public double max() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (Double.compare(array[i].doubleValue(), max) > 0) {
                max = array[i].doubleValue();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 3, 4};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println(minMax.min());
    }
}
