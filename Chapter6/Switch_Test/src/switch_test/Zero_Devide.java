package switch_test;

public class Zero_Devide {

    public void isDevideByZero(float num, float divider) {
        if (divider == 0) {
            System.out.println("Do not divide by zero !!!");
        } else {
            System.out.println("result of " + num + " / " + divider + " = " + (num / divider));
        }
    }
}
