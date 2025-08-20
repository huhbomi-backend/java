package day03;

public class ArrayExam2 {
    public static void main(String[] args) {
        int [] ori1 = {1,2,3};
        int [] ori2 = {4,5,6,7};

        int [] copy = new int[ori1.length+ori2.length];

        System.arraycopy(ori1,0,copy,0,ori1.length);
        System.arraycopy(ori2,0,copy,ori1.length,ori2.length);

        System.out.println(copy);

    }

}
