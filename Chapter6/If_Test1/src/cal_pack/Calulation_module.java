package cal_pack;

import java.util.Scanner;

public class Calulation_module {

    public boolean checkValue() {
        int key;
        Scanner scan = new Scanner(System.in);
        System.out.print("Press 1 to continue >>> ");
        key = scan.nextInt();
        boolean check = false;
        if (key == 1) {
            check = true;
        }
        return check;
    }

    public float percentScore(float score) {
        return score / 30.0f * 100;
    }

    public void percentResult(boolean check) {
        float score, percent;
        if (check) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Score >>> ");
            score = scan.nextFloat();
            percent = percentScore(score);
            System.out.println("Your Score = " + percent + "%");
        }
    }
}
