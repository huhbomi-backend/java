package day03;

public class ForExam {
    public static void main(String[] args) {
        for(int x=0 ; x<5; x++){

            for(int z=0 ; z<5-x; z++){
                System.out.print(" ");
            }

            for(int y=0 ; y<2*x+1; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
