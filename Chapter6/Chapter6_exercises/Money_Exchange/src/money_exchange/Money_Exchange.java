package money_exchange;

import javax.swing.*;
import java.util.Scanner;

public class Money_Exchange {

    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Teat");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 150);
        f.setVisible(true);
        
        Scanner scan = new Scanner(System.in);
        System.out.print("กรอกจำนวนเงินที่ต้องการจะแลก >>> ");
        int money = scan.nextInt();
        System.out.println("Total money : " + money);
        Money_Calculation calculation = new Money_Calculation();
        calculation.Exchange_Calculation(money);
    }

}
