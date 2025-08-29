package day07;

// 나는 기능 규칙
interface Flyable {
    void fly();
}

// 수영하는 기능 규칙
interface Swimmable {
    void swim();
}

// 다중 구현 가능 -> 추상화보다 확장성이 크다
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("오리 날기");
    }

    @Override
    public void swim() {
        System.out.println("오리 헤엄치기");
    }
}

public class Exam {
    public static void main(String[] args) {
        //객체 생성
        Duck duck = new Duck();

        // Duck은 Flyable 규칙도 따르고, Swimmable 규칙도 따름
        duck.fly();
        duck.swim();

        // 다형성 활용
        Flyable f = duck;         // Duck을 Flyable 관점으로 바라봄

        f.fly();   // ✅ 가능 (Flyable에 정의된 메서드)
        //f.swim();  // ❌ 불가능 (Flyable엔 swim 규칙이 없음)
    }
}
