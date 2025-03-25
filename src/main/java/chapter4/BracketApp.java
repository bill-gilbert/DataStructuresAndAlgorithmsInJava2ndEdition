package chapter4;

public class BracketApp {
    public static void main(String[] args) {
        String bracket = "c[d]";
        String bracket2 = "a[b{c(d)e}f]";
        String bracket3 = "a[b{c(de}f]";

        BracketChecker checker = new BracketChecker(bracket);
        checker.check();
        BracketChecker checker2 = new BracketChecker(bracket2);
        checker2.check();
        BracketChecker checker3 = new BracketChecker(bracket3);
        checker3.check();
    }
}
