public class ContractSalaryCalculator implements SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.1;
    }
}
