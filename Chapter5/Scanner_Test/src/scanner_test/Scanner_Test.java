package scanner_test;

import java.util.Scanner;

public class Scanner_Test {

    public static void main(String[] args) {
        String name;
        int quantity;
        double price;
        Scanner sn = new Scanner(System.in);
        System.out.print("ป้อนชื่อสินค้า >>> ");
        name = sn.nextLine();
        System.out.print("ป้อนจำนวนสินค้า >>> ");
        quantity = sn.nextInt();
        System.out.print("ป้อนราคาสินค้าต่อหน่วย >>> ");
        price = sn.nextDouble();
        System.out.printf("%s %d หน่วย ", name, quantity);
        System.out.printf("หน่วยละ %.2f บาท\n", price);
        System.out.printf("รวมเป็นเงิน %.2f บาท\n", quantity * price);
        System.out.printf("ภาษี 7%% เป็นเงินสุทธิ %.2f บาท\n", 1.07f * (quantity * price));
    }

}
