package money_exchange;

import javax.swing.JOptionPane;

public class Money_Exchange {

    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("กรอกจำนวนเงินที่ต้องการจะแลก");
        int money = Integer.parseInt(data);
        System.out.printf("Total money : %,d bath\n", money);
        Money_Calculation calculation = new Money_Calculation();
        calculation.Exchange_Calculation(money);
    }

}
