package array3d;

import java.util.Scanner;

class Room_info {

    public int b, f, r, total_man, total_avail;

    public int get_total(int[][][] rm, int t) {
        int count = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < f; j++) {
                for (int k = 0; k < r; k++) {
                    switch (t) {
                        case 0:
                            if (rm[i][j][k] == 0) {
                                count++;
                            }
                            break;
                        case 1:
                            if (rm[i][j][k] != 0) {
                                count = count + rm[i][j][k];
                            }
                            break;
                    }
                }
            }
        }
        return count;
    }

    public int[][][] inputdata() {
        int[][][] rm;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total buildings : ");
        b = scan.nextInt();
        System.out.print("Enter total floors : ");
        f = scan.nextInt();
        System.out.print("Enter room / floor : ");
        r = scan.nextInt();
        rm = new int[b][f][r];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < f; j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print("Enter total people in building " + (i + 1) + " floor " + (j + 1) + " room  " + (k + 1) + " : ");
                    int g = scan.nextInt();
                    rm[i][j][k] = g;
                }
            }
        }
        return rm;
    }

    public void checkData(int[][][] rm) {
        total_man = get_total(rm, 1);
        total_avail = get_total(rm, 0);
    }

    public void showData() {
        System.out.printf("Total people = %d people\n", total_man);
        System.out.printf("Total available room = %d room(s)\n", total_avail);
    }
}

public class Array3D {

    public static void main(String[] args) {
        int[][][] rooms;
        Room_info room_data = new Room_info();
        rooms = room_data.inputdata();
        room_data.checkData(rooms);
        room_data.showData();
    }

}
