package private_ac_mod;

public class Private_Ac_Mod {
    
    public static void main(String[] args) {
        private_emp emp = new private_emp();
        System.out.println("Current Salart is = " + emp.get_salary());
        System.out.println("New Salary is = " + emp.set_salary(23000));
    }
    
}
