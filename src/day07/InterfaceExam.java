package day07;

interface Shape {
    // 1) 추상 메서드 (구현 x)
    double getArea();

    // 2) default 메서드 (기본 구현 제공 → 필요시 오버라이딩 가능)
    default void printInfo() {
        System.out.println("나는 도형입니다.");
    }

    // 3) static 메서드 (객체 생성 없이 인터페이스 이름으로 직접 호출)
    static void description() {
        System.out.println("Shape 인터페이스: 모든 도형의 규칙 정의");
    }
}

class Circle implements Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    // 추상 메서드 반드시 구현
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    // default 메서드는 선택적으로 오버라이딩 가능
    @Override
    public void printInfo() {
        System.out.println("나는 원입니다. 반지름 = " + r);
    }
}

public class InterfaceExam {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        // 추상 메서드 구현 호출
        System.out.println("원의 넓이: " + c.getArea());

        // default 메서드 호출 (Circle에서 오버라이딩한 버전 실행됨)
        c.printInfo();

        // static 메서드 호출 (객체 필요 없음)
        Shape.description();
    }
}
