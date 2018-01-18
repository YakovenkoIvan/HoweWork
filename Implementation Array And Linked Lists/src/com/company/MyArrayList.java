package com.company;

public class MyArrayList<T> {

    private Object container[];
    private int size;

    public MyArrayList(int size) {
        if (size > 0) {
            container = new Object[size];
        } else {
            container = new Object[16];
        }
    }

    public MyArrayList() {
        this(16);
    }

    private void checkIndex (int index){
        if(index<0||index>container.length){
            throw new IllegalArgumentException();
        }
    }

    public void add(T element) {
        container[size] = element;
        size++;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) container[index];
    }

    public T set(int index, T element) {
        checkIndex(index);
        return (T) (container[index] = element);
    }

    public void delete(int index) {
        checkIndex(index);
        container[index] = null;
        size--;
    }

    public int size() {
        return size;
    }
}
