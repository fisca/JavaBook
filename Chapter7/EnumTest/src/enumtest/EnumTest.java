package enumtest;

import java.util.Scanner;

public class EnumTest {

    enum Grade {

        G, S, U
    };

    public static void main(String[] args) {
        String msg = "Unknown";
        System.out.print("Grade Level are : ");
        for (Grade grade : Grade.values()) {
            System.out.printf("%2s", grade);
        }
        Scanner scan = new Scanner(System.in);
    }

}
