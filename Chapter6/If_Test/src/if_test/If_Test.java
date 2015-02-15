package if_test;

import java.util.Scanner;

public class If_Test {

    public static void main(String[] args) {
        int key;
        float score, percent;
        Scanner scan = new Scanner(System.in);
        System.out.print("Press 1 to continue >>> ");
        key = scan.nextInt();
        if (key == 1) {
            System.out.print("Enter Score >>> ");
            score = scan.nextFloat();
            percent = score / 30.0f * 100;
            System.out.println("Your Score = " + percent + "%");
        }
        System.out.println("Good Bye !!!");
    }

}
