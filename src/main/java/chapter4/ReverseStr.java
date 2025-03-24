package chapter4;

/**
 *
 */
public class ReverseStr {
    public static void main(String[] args) {
        StackX stackX = new StackX(10);
        stackX.push(20);
        stackX.push(40);
        stackX.push(60);
        stackX.push(80);

        while (!stackX.isEmpty()) {
            long value = stackX.pop();
            System.out.println(value);
        }
    }
}
