package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class ReverseStr {
    public static void main(String[] args) throws IOException {
        StackCh stackCh = new StackCh(10);

        String input, output;

        while (true) {
            System.out.println("Enter A string: ");
            System.out.flush();
            input = getString();
            System.out.println(reverser(input));
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static String reverser(String str) {
        StackCh stackCh = new StackCh(str.length());

        for (int i = 0; i < str.length(); i++) {
            stackCh.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stackCh.isEmpty()) {
            reversed.append(stackCh.pop());
        }

        return reversed.toString();

    }
}
