package money_exchange;

public class Money_Calculation {

    public void Exchange_Calculation(int money) {
        money = this.UnitCalculation(money, 1000);
        money = this.UnitCalculation(money, 500);
        money = this.UnitCalculation(money, 100);
        money = this.UnitCalculation(money, 50);
        money = this.UnitCalculation(money, 20);
        money = this.UnitCalculation(money, 10);
        money = this.UnitCalculation(money, 5);
        this.UnitCalculation(money, 1);
    }

    public int UnitCalculation(int money, int moneyUnit) {
        int unitQuantity = 0;
        if (money != 0) {
            if (money % moneyUnit == 0) {
                unitQuantity = money / moneyUnit;
                money = 0;
            } else if (money % moneyUnit != 0 && money > moneyUnit) {
                unitQuantity = (int) (money / moneyUnit);
                money = money - (unitQuantity * moneyUnit);
            }
            this.Display_Message(moneyUnit, unitQuantity);
        }
        return money;
    }

    public void Display_Message(int moneyUnit, int unitQuantity) {
        if (unitQuantity > 0) {
            if (moneyUnit >= 20) {
                System.out.println("The " + moneyUnit + " bath note. = " + unitQuantity + " note(s).");
            } else {
                System.out.println("The " + moneyUnit + " baht coin. = " + unitQuantity + " coin(s).");
            }
        }
    }

}
