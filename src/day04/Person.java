// Person.java
package day04;

public class Person {
    private static int count = 0;                 // 생성된 사람 수 카운트

    private String name;

    public Person(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() { // 전체 인원수 반환
        return count;
    }

    public void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
    }
}
