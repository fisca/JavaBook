package protected_ac_mod;

class Ac_Mod extends protected_emp {

    public void set_salary() {
        System.out.println("Current Salary is = " + salary);
        salary = 22000.0f;
        System.out.println("New Salary is = " + salary);
    }
}

public class Protected_Ac_Mod {

    public static void main(String[] args) {
        Ac_Mod emp = new Ac_Mod();
        emp.set_salary();

        protected_emp emp2;
        emp2 = new protected_emp();
        emp2.salary = 25000.0f;
        System.out.println("Update Salary is = " + emp2.salary);
    }

}
