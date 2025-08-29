package day05;

import java.util.Scanner;

public class Dice {
    int face = 6;
    int eye;

    public void roll(){
        eye = (int)(Math.random()*face)+1;
    }

    public static void main(String[] args) {

    }
}
