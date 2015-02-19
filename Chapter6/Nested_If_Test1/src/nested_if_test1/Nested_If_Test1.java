package nested_if_test1;

import java.util.Scanner;

public class Nested_If_Test1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("จำนวนหน่วยกิจวิชาเอกบังคับ >>> ");
        int x = scan.nextInt();
        System.out.print("จำนวนหน่วยกิจวิชาเอกเลือก >>> ");
        int y = scan.nextInt();
        nestedifTest_Condition nestedif = new nestedifTest_Condition();
        nestedif.checkPass(x, y);
    }

}
