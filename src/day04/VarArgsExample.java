package day04;

public class VarArgsExample {
    public static int minus(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {

        int c = minus(5,3);

        System.out.println(c);
    }
}
