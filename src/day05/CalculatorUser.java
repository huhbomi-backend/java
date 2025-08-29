package day05;

public class CalculatorUser {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.cal('+', 1, 2, 3));   // 6.0
        System.out.println(cal.cal('-', 10, 3, 2));  // 5.0
        System.out.println(cal.cal('*', 2, 3, 4));   // 24.0
        System.out.println(cal.cal('/', 10, 2, 2));  // 2.5
    }
}
