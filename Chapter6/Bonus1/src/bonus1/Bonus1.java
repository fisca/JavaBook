package bonus1;

import java.util.Scanner;

public class Bonus1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนข้อมูลเงินเดือนที่นี่ >>> ");
        float salary = scan.nextFloat();
        Bonus_Calculator bonus = new Bonus_Calculator();
        float bonus_result = bonus.calulateBonus(salary);
        System.out.println("โบนัส เท่ากับ " + bonus_result + " บาท");
    }

}
