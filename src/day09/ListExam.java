package day09;

import java.util.List;
import java.util.ArrayList;


public class ListExam {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        //ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println(fruits.get(0));
    }
}
