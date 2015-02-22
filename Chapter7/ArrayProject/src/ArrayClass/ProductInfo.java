package ArrayClass;

import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ProductInfo {

    public String[] name;
    public double[] price;
    public int idx;

    public void SetData() {
        name = new String[5];
        name[0] = "COKE";
        name[1] = "FANTA";
        name[2] = "MAMA";
        name[3] = "PEPSI";
        name[4] = "SPRITE";
        price = new double[5];
        price[0] = 10.75;
        price[1] = 10.50;
        price[2] = 5.25;
        price[3] = 10.25;
        price[4] = 11.25;
    }

    public void ShowData() {
        System.out.printf("%-10s %10s\n", "Name", "Price");
        System.out.println("=============================================================\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s %10.2f\n", name[i], price[i]);
        }
        System.out.println("=============================================================\n");
    }

    public void GetData() {
        Scanner scan = new Scanner(System.in);
        do {
            // System.out.print("Enter product name : ");
            // String productName = scan.nextLine();
            String productName = JOptionPane.showInputDialog("Enter product name");
            idx = Arrays.binarySearch(name, productName);
            if (idx < 0) {
                System.out.println("This product name is not found.");
            }
        } while (idx < 0);
        // System.out.print("Enter product units : ");    
        // int u = scan.nextInt();
        String productUnit = JOptionPane.showInputDialog("Enter product units");
        int u = Integer.parseInt(productUnit);

        // System.out.println("==============================================================\n");
        // System.out.println("Your order is " + name[idx] + " " + u + " units = " + u + " * " + price[idx] + " = " + u * price[idx] + " bath.");
        // System.out.println("==============================================================\n");
        JOptionPane.showMessageDialog(null,
                "Your order is " + name[idx] + " " + u + " units = " + u + " * " + price[idx] + " = " + u * price[idx] + " bath.",
                "Oder result", JOptionPane.PLAIN_MESSAGE);
    }
}
