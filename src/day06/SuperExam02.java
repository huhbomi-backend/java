package day06;
// super, this
class Parent4 {
    int x = 10;

    void hello() {
        System.out.println("부모의 hello");
    }
}

class Child4 extends Parent4 {
    int x = 20;

    @Override
    void hello() {
        System.out.println("자식의 hello");
    }

    void print() {
        System.out.println("this.x = " + this.x);   // 내 것 (20)
        System.out.println("super.x = " + super.x); // 부모 것 (10)

        this.hello();   // 자식의 hello
        super.hello();  // 부모의 hello
    }
}

public class SuperExam02 {
    public static void main(String[] args) {
        Child4 c = new Child4();
        c.print();
    }
}