package package_ac_mod;

public class Package_Ac_Mod {

    public static void main(String[] args) {
        package_emp emp = new package_emp();
        System.out.println("Current Salary is = " + emp.salary);
        emp.salary = 21000.0f;
        System.out.println("New Salary is = " + emp.salary);
    }

}
