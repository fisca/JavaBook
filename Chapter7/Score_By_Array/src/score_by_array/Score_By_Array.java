package score_by_array;

import java.util.Scanner;

public class Score_By_Array {

    public static void main(String[] args) {
        float score, Scores[];
        int n = 0;
        Scores = new float[10];
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("score : ");
            score = scan.nextFloat();
            if (score >= 0) {
                Scores[n] = score;
                n++;
            }
        } while (score >= 0);
        for (int i = 0; i < n; i++) {
            System.out.println("score " + (i + 1) + " = " + Scores[i]);
        }
    }

}
