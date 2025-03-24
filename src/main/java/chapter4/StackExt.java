package chapter4;

import java.util.EmptyStackException;

public class StackExt<T> implements Stack<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public StackExt(int s) {
        maxSize = s;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(T x) {
        stackArray[++top] = x;
    }

    public T pop() {
        if(this.isEmpty())
            throw new EmptyStackException();
        return element(top--);
    }

    public T peek() {
        if(this.isEmpty())
            throw new EmptyStackException();
        return element(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top < maxSize;
    }

    // Safe because push(T) is type checked.
    @SuppressWarnings("unchecked")
    private T element(int index) {
        return (T)stackArray[index];
    }
}
