package arrayid;

import java.util.Scanner;

public class ArrayId {

    public static void main(String[] args) {
        final int MAX = 3;
        int i;
        int num[];
        num = new int[MAX];
        Scanner scan = new Scanner(System.in);
        System.out.println("======= Input data =======");
        for (i = 0; i < MAX; i++) {
            System.out.print("enter number " + (i + 1) + " >>> ");
            num[i] = scan.nextInt();
        }
        System.out.println("======= Output data =======");
        for (i = 0; i < MAX; i++) {
            System.out.println("Yout input number " + (i + 1) + " >>> " + num[i]);
        }
    }

}
