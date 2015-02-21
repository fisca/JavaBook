package student_grade;

import java.util.Scanner;

public class Score {

    public float calScore() {
        float score;
        Scanner scan = new Scanner(System.in);
        System.out.print("กรอกคะแนนรวม >>> ");
        score = scan.nextFloat();
        return score;
    }

    public char calGrade(float score) {
        char grade = 'U';
        if (score > 75) {
            grade = 'H';
        } else if (score >= 50) {
            grade = 'S';
        }
        return grade;
    }
}
