
public class MainOCP {
    public static void main(String[] args) {

        Employee employee = new Employee("Alex", 1000);

        SalaryCalculator permanent =
                new PermanentSalaryCalculator();

        SalaryCalculator intern =
                new InternSalaryCalculator();

        System.out.println("Permanent salary: "
                + permanent.calculateSalary(employee));

        System.out.println("Intern salary: "
                + intern.calculateSalary(employee));
    }
}
