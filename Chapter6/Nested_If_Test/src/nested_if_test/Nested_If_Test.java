package nested_if_test;

import java.util.Scanner;

public class Nested_If_Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("จำนวนหน่วยกิจวิชาเอกบังคับ >>> ");
        int x = scan.nextInt();
        System.out.print("จำนวนหน่วยกิจวิชาเอกเลือก >>> ");
        int y = scan.nextInt();
        if (x >= 20 && y >= 30) {
            System.out.println("ครบตามหลักสูตร");
        } else if (x < 20 && y < 30) {
            System.out.println("ขาดวิชาเอกบังคับ " + (20 - x) + " หน่วยกิจ\n" + "ขาดวิชาเอกเลือก " + (30 - y) + " หน่วยกิจ");
        } else if (x < 20) {
            System.out.println("ขาดวิชาเอกบังคับ " + (20 - x) + " หน่วยกิจ");
        } else if (y < 30) {
            System.out.println("ขาดวิชาเอกเลือก " + (30 - y) + " หน่วยกิจ");
        }
    }

}
