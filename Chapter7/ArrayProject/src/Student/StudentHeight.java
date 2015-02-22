package Student;

import java.util.Scanner;
import ArrayClass.MaxMinAvg;

public class StudentHeight {

    public static void main(String[] args) {
        int height[];
        height = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Height " + (i + 1) + " : ");
            height[i] = scan.nextInt();
        }
        MaxMinAvg std_height = new MaxMinAvg();
        float avgHeight = std_height.getAvg(height);
        System.out.printf("Average height is %.2f cm\n", avgHeight);
    }

}
