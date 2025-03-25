package chapter4;

public class StackCh {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackCh(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char x) {
        stackArray[++top] = x;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
