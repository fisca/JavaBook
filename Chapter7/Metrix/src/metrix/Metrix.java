package metrix;

import java.util.Scanner;

public class Metrix {

    public static void main(String[] args) {
        int[][] a, b, c;
        int i, j;

        a = new int[3][2];
        b = new int[3][2];
        c = new int[3][2];

        Scanner scan = new Scanner(System.in);

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = scan.nextInt();
                System.out.printf("b[%d][%d] = ", i, j);
                b[i][j] = scan.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.printf("%2d", a[i][j]);
                if (j == 1) {
                    System.out.print(" |");
                }
            }

            if (i == 1) {
                System.out.print(" + ");
            } else {
                System.out.print("   ");
            }

            for (j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.printf("%2d", b[i][j]);
                if (j == 1) {
                    System.out.print(" |");
                }
            }

            if (i == 1) {
                System.out.print(" = ");
            } else {
                System.out.print("   ");
            }

            for (j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print("|");
                }
                System.out.printf("%3d", c[i][j]);
                if (j == 1) {
                    System.out.print(" |");
                }
            }
            System.out.print("\n");
        }

    }
}
