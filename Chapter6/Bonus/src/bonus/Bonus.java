package bonus;

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนข้อมูลเงินเดือนที่นี่ >>> ");
        float salary = scan.nextFloat();
        float bonus = 0.05f * salary;
        System.out.println("โบนัส เท่ากับ " + bonus + " บาท");
    }

}
