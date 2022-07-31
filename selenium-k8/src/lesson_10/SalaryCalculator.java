package lesson_10;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {

    // CASTING | BAD PRACTICE
    // Break IS-A relationship

    public int getTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportMoney();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();

        System.out.println(new SalaryCalculator().getTotalSalary(Arrays.asList(fte, contractor)));
    }
}
