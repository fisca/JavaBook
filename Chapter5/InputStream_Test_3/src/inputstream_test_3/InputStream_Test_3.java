package inputstream_test_3;

import java.io.*;

public class InputStream_Test_3 {

    public static void main(String[] args) throws IOException {
        String input;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ป้อนข้อมูลเงินบาทที่นี่ >>> ");
        input = stdin.readLine();
        double money = Double.parseDouble(input);
        System.out.print("ป้อนข้อมูลอัตราแลกเปลี่ยนเงินบาทต่อ 1 ดอลลาร์ ที่นี่ >>> ");
        input = stdin.readLine();
        double dollar_rate = Double.parseDouble(input);
        System.out.println("แลกเงินดอลลาร์ได้ " + (money / dollar_rate) + " ดอลลาร์");
    }

}
