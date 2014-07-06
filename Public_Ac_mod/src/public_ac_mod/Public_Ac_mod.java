package public_ac_mod;

public class Public_Ac_mod {

    public static void main(String[] args) {
        public_emp emp = new public_emp();
        System.out.println("Current Salary is = " + emp.salary);
        emp.salary = 25000.0f;
        System.out.println("New Salary is = " + emp.salary);
    }

}
