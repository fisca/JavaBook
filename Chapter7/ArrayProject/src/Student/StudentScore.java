package Student;

import java.util.Scanner;
import ArrayClass.MaxMinAvg;

public class StudentScore {

    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Score " + (i + 1) + " : ");
            scores[i] = scan.nextInt();
        }
        MaxMinAvg test = new MaxMinAvg();
        int max = test.getMax(scores);
        int min = test.getMin(scores);
        float avg = test.getAvg(scores);
        System.out.println("Min score is " + min + "\nMax score is " + max + "\nAverage score is " + avg);
    }

}
