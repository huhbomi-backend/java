package day08;

//import java.lang.Math; // 굳이 안 해도 되지만 가능

//백엔드 개발: 주로 난수 토큰 생성, 시간 지연 계산, 통계 처리.

public class MathExam {
    public static void main(String[] args) {
        // 1. 절댓값 (abs)
        int num = -15;
        System.out.println("abs(-15) = " + Math.abs(num)); // 15

        // 2. 올림, 내림, 반올림
        double value = 12.34;
        System.out.println("ceil(12.34) = " + Math.ceil(value));   // 13.0 (무조건 올림)
        System.out.println("floor(12.34) = " + Math.floor(value)); // 12.0 (무조건 내림)
        System.out.println("round(12.34) = " + Math.round(value)); // 12 (반올림)

        // 3. 최댓값, 최솟값
        int a = 42, b = 17;
        System.out.println("max(42, 17) = " + Math.max(a, b)); // 42
        System.out.println("min(42, 17) = " + Math.min(a, b)); // 17

        // 4. 제곱, 제곱근, 제곱승
        System.out.println("sqrt(49) = " + Math.sqrt(49));   // 7.0
        System.out.println("pow(2, 10) = " + Math.pow(2, 10)); // 1024.0

        // 5. 랜덤값
        // ( Math.random() * 범위 ) + 최소값
        double randomValue = Math.random(); // 0.0 <= 값 < 1.0
        System.out.println("random() = " + randomValue);

        // 예시: 주사위 (1~6)
        int dice = (int)(Math.random() * 10) + 20;
        System.out.println("주사위 눈 = " + dice);
    }
}
