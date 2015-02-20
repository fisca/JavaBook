package for_test_1;

import java.util.Scanner;

public class For_Test_1 {

    public static void main(String[] args) {
        int N, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N >>> ");
        N = scan.nextInt();
        System.out.print("Result of ");
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
            System.out.print(i);
            if (i != N) {
                System.out.print(" + ");
            }
        }
        System.out.println("\n = " + sum);
    }

}
