package avgscore;

import java.util.Scanner;

public class AvgScore {

    public static void main(String[] args) {
        String name;
        int score1, score2, score3, Sum_score;
        double avg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name >>> ");
        name = scan.nextLine();
        System.out.print("Enter Score 1 >>> ");
        score1 = scan.nextInt();
        System.out.print("Enter Score 2 >>> ");
        score2 = scan.nextInt();
        System.out.print("Enter Score 3 >>> ");
        score3 = scan.nextInt();
        Sum_score = score1 + score2 + score3;
        avg = Sum_score / 3.0;
        System.out.println(name + "'s average score = " + avg + " point.");
    }
}
