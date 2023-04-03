package task8;

public interface Stack<T> {
    T peek();
    T pop();
    void push(T value);
    int size();
}
