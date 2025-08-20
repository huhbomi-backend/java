package day03;

public class ArrayExam1 {
    public static void main(String[] args) {
        int[] scores = {95, 87, 66, 73, 82};

        for (int score : scores) {
            System.out.println(score);
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.printf("총첨 : %d, 평균 : %d\n", sum, sum / scores.length);

        int max = 0;
        for (int score : scores) {
            if (max < score) {
                max = score;
            }
        }
        System.out.printf("최대값 : %d\n", max);
    }

}
