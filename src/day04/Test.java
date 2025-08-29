// Test.java
package day04;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("보미");
        Person p2 = new Person("철수");

        p1.introduce();
        p2.introduce();

        //System.out.println("현재 생성된 사람 수: " + p1.getCount()); // 2
        System.out.println("현재 생성된 사람 수: " + Person.getCount()); // 2
    }
}
