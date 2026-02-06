public class PermanentSalaryCalculator implements SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.2;
    }
}
