package student_grade;

import java.util.Scanner;

public class Student_Grade {

    public static void main(String[] args) {
        String name;
        char grade;
        Scanner scan = new Scanner(System.in);
        System.out.print("กรอกชื่อนักศึกษา >>> ");
        name = scan.nextLine();
        Score score = new Score();
        float totalScore = score.calScore();
        grade = score.calGrade(totalScore);
        System.out.printf("ชื่อ : %s\nได้คะแนนรวม %.2f\nเกรด : %c\n", name, totalScore, grade);
    }

}
