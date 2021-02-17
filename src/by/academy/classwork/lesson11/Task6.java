package by.academy.classwork.lesson11;

import by.academy.tasks.oop.task8.Animal;

import java.io.Serializable;

public class Task6<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T t;
    private V v;
    private K k;

    public Task6(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void getClass(T t) {
        t.getClass();
    }

}
