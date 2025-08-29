package day05;

public class Calculator {
    // 필요한 필드가 없으면 과감히 제거
    // private String inst;

    public double cal(char op, double... numbers) {
        switch (op) {
            case '+': return plus(numbers);
            case '-': return minus(numbers);
            case '*': return multiply(numbers);
            case '/': return divide(numbers);
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자: " + op);
        }
    }

    private double plus(double... numbers) {
        double res = 0;
        for (double n : numbers) res += n;
        return res;
    }

    private double minus(double... numbers) {
        if (numbers.length == 0) return 0;   // 입력 없으면 0
        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) res -= numbers[i];
        return res;
    }

    private double multiply(double... numbers) {
        if (numbers.length == 0) return 1;   // 공집합의 곱은 1로 처리
        double res = 1;
        for (double n : numbers) res *= n;
        return res;
    }

    private double divide(double... numbers) {
        if (numbers.length == 0)
            throw new IllegalArgumentException("나눗셈은 최소 1개 이상의 피연산자가 필요합니다.");
        double res = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0)
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            res /= numbers[i];
        }
        return res;
    }
}
