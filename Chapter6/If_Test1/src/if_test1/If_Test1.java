package if_test1;

import cal_pack.Calulation_module;

public class If_Test1 {

    public static void main(String[] args) {
        Calulation_module cal_module = new Calulation_module();
        boolean result = cal_module.checkValue();
        cal_module.percentResult(result);
        System.out.println("Good Bye !!!");
    }
}
