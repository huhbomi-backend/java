package day06;

class Parent5 {
    Parent5(String msg) {
        System.out.println("부모 생성자: " + msg);
    }
}

class Child5 extends Parent5 {
    Child5() {
        super("부모 생성자 실행"); // 부모 생성자 직접 호출
        System.out.println("자식 생성자 실행");
    }
}

public class SuperExam03 {
    public static void main(String[] args) {
        new Child5();
    }
}
