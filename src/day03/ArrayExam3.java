package day03;

public class ArrayExam2 {
    public static void main(String[] args) {

        //깊은 복사처럼 보임
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1.clone();
        arr2[0] = 99;

        System.out.println(arr1[0]); // 1
        System.out.println(arr2[0]); // 99

        //얕은 복사처럼 보임
        String[] arr3 = {"A", "B", "C"};
        String[] arr4 = arr3.clone();
        arr4[0] = "Z";

        System.out.println(arr3[0]); // A (String은 불변객체라 안전)
        System.out.println(arr4[0]); // A (String은 불변객체라 안전)
    }

}
