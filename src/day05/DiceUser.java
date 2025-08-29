package day05;

import java.util.Scanner;

public class DiceUser {
    public static void countNum(Dice dice, int N, int num){
        int cnt = 0;

        for(int i = 0; i < N; i++){
            dice.roll();

            if(dice.eye == num){
                cnt++;
            }
        }

        System.out.printf("주사위 %d번 굴렸을 때, %d가 나온 횟수 : %d \n", N,num,cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = sc.nextInt();
        Dice dice = new Dice();

        countNum(dice, N, num);
    }
}
