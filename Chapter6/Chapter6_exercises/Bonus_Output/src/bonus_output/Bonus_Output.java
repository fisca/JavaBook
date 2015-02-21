package bonus_output;

import java.util.Scanner;

public class Bonus_Output {

    public static void main(String[] args) {
        int employeeNumber, activeYear;
        float sellValue, bonus = 0, totalBonus = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("จำนวนพนักงาน(คน) >>> ");
        employeeNumber = scan.nextInt();
        for (int i = 1; i <= employeeNumber; i++) {
            System.out.print("ยอดขายของพนักงานคนที่ " + i + " (บาท) >>> ");
            sellValue = scan.nextFloat();
            System.out.print("ระยะเวลาการทำงาน(ปี) >>> ");
            activeYear = scan.nextInt();
            if (activeYear >= 5) {
                bonus = 0.05f * sellValue;
            } else if (activeYear >= 1) {
                bonus = 0.03f * sellValue;
            }
            totalBonus += bonus;
            System.out.printf("พนักงานคนที่ %d ได้รับโบนัสเป็นเงิน %,.2f บาท\n", i, bonus);
        }
        System.out.printf("รวม จำนวนเงินโบนัสที่บริษัทต้องจ่ายทั้งหมดเท่ากับ %,.2f บาท\n", totalBonus);
    }

}
