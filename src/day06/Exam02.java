package day06;

import org.w3c.dom.ls.LSOutput;

class Parent1{
    int i = 1;
}

class Child1 extends Parent1{
    int j = 2;
}

public class Exam02 {
    public static void main(String[] args) {
        //1. 부모는 자식을 가리킬 수 있다
        Parent1 p = new Child1();

        //2. 핃드는 타입을 따른다
        Parent1 pp = new Parent1();
        System.out.println(pp.i);

        //3. 메소드는 오버라이드되면 무조건 자식의 것을 사용;
    }
}
