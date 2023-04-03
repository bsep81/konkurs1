package task8;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {
    private T[] values = (T[]) new Object[10];
    private int index = 0;


    @Override
    public T peek() {
        if (index < 1) {
            return null;
        }
        return values[index - 1];
    }

    @Override
    public T pop() {
        if(index == 0){
            return null;
        }
        T value = values[--index];
        values[index] = null;
        return value;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public void push(T value) {
        values[index++] = value;
        if (index == values.length) {
            values = Arrays.copyOf(values, index + 10);
        }
    }
}
