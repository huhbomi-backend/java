package day04;

public class ScoreTableExample {
    public static void main(String[] args) {
        String[] students = {"김철수","이영희","박민수"};
        String[] subjects = {"국어","영어","수학","과학"};

        int[][] scores = {
                {90,85,88,92},
                {85,90,95,88},
                {78,82,85,90}
        };

        System.out.println("=== 성적표 ===");
        System.out.print("이름\t");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + "\t");
        }
        System.out.print("총점\t평균");
        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t");
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
                sum += scores[i][j];
            }
            System.out.println(sum + "\t" + (double) sum / scores[i].length);
            System.out.println();
        }
    }
}
