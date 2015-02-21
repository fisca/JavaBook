package continue_test;

import java.util.Scanner;

public class Continue_Test {

    public static void main(String[] args) {
        int i = 1, score;
        Scanner scan = new Scanner(System.in);
        while (i <= 5) {
            System.out.print("ป้อนข้อมูลคะแนนนิสิตคนที่ " + i + " >>> ");
            score = scan.nextInt();
            if (score < 0 || score > 100) {
                System.out.println(score + " เป็นข้อมูลคะแนนที่ไม่ถูกต้อง");
                continue;
            }
            System.out.println(score + " เป็นข้อมูลคะแนนที่ถูกต้อง");
            i = i + 1;
        }
    }

}
