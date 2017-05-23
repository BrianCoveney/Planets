package ie.cit.brian.calculations;

import java.util.AbstractList;
import java.util.Arrays;

/**
 * Created by brian on 22/05/17.
 */
public class CustomArrayList<T> extends AbstractList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 8;
    private Object elements[];

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size = elements.length;
    }

    public boolean add(T e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
        return false;
    }


    public T remove(int i) {
        T oldValue = (T) elements[i];
        for (int j = i; j < elements.length - 1; j++) {
            elements[j] = elements[j + 1];
        }
        reduceCapa();
        return oldValue;
    }


    private void reduceCapa() {
        int newSize = elements.length -1;
        elements = Arrays.copyOf(elements, newSize);
        size = newSize;
    }


    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }


    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (T) elements[i];
    }


}
























