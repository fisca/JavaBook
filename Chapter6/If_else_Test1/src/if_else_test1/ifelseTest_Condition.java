package if_else_test1;

public class ifelseTest_Condition {

    public boolean checkRetired(int age) {
        boolean check;
        if (age > 60) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
}
