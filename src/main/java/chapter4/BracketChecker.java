package chapter4;

public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {

        int stackSize = input.length();
        StackCh stackCh = new StackCh(stackSize);
        for (int j = 0; j < stackSize; j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stackCh.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stackCh.isEmpty()) {
                        char ch2 = stackCh.pop();
                        if ((ch2 == '}' && ch != '{') ||
                                (ch2 == ']' && ch != '[') ||
                                (ch2 == ')' && ch != '(')) {
                            System.out.println("Invalid bracket");

                        }
                    } else {
                        System.out.println("Invalid bracket");
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stackCh.isEmpty()) {
            System.out.println("Error: missing right delimiter!");
        }
    }
}
