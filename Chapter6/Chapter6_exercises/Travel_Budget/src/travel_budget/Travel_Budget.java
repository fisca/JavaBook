package travel_budget;

import java.util.Scanner;

public class Travel_Budget {

    public static void main(String[] args) {
        float price, budget, extraRate = 0.8f;
        int personNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("อัตราคาใช้จ่ายปกติ (บาท/คน) >>> ");
        price = scan.nextFloat();
        System.out.print("จำนวนสมาชิก (คน) >>> ");
        personNumber = scan.nextInt();
        if (personNumber <= 8) {
            budget = personNumber * price;
        } else {
            int extraPerson = personNumber - 8;
            budget = price * (8 + extraPerson * extraRate);
            float average = budget / personNumber;
            System.out.printf("เฉลี่ยจ่ายคนละ %,.2f บาท\n", average);
        }
        System.out.printf("รวมค่าใช้จ่ายทั้งหมดเท่ากับ %,.2f บาท\n", budget);        
    }

}
