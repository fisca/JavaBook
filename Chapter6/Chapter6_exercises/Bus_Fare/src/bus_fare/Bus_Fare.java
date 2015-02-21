package bus_fare;

import java.util.Scanner;

public class Bus_Fare {

    public static void main(String[] args) {
        float price;
        int passengerNumber;
        Scanner scan = new Scanner(System.in);
        System.out.print("อัตราค่าโดยสารต่อคน(บาท) >>> ");
        price = scan.nextFloat();
        System.out.print("จำนวนผู้โดยสาร(คน) >>> ");
        passengerNumber = scan.nextInt();
        Fare fare = new Fare();
        float totalFare = fare.calFare(price, passengerNumber);
        System.out.printf("จำนวนค่าโดยสารรวม(บาท) >>> %,.2f บาท\n", totalFare);
    }

}
