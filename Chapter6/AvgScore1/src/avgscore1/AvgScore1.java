package avgscore1;

import java.util.Scanner;

public class AvgScore1 {

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
        Score_Calculator avgscore = new Score_Calculator();
        float avg_result = avgscore.calculateAverage(score1, score2, score3);
        System.out.println(name + "'s average score = " + avg_result + " point.");
    }

}
