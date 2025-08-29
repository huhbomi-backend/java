package day03;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// 얕은복사

public class ArrayExam3 {
    public static void main(String[] args) {
        // 원본 배열
        Person[] p1 = { new Person("철수"), new Person("영희") };

        // clone()으로 복사
        Person[] p2 = p1.clone();

        // p2[0]의 name 변경
        p2[0].name = "홍길동";

        // 결과 출력
        System.out.println("p1[0].name: " + p1[0].name);
        System.out.println("p2[0].name: " + p2[0].name);
    }

}
