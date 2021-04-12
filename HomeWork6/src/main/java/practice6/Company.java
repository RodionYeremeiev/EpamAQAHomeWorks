package practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Company {
    private Employee[] employees;

    public Company(Employee... employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        if (companyBonus == null) {
            throw new IllegalArgumentException();
        }
        for (Employee employee : employees) {
            employee.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal totalSalary = BigDecimal.ZERO;

        for (Employee employee : employees) {
            totalSalary = totalSalary.add(employee.toPay());
        }
        return totalSalary;
    }

    public String nameMaxSalary() {
        String name = "";
        BigDecimal maxSalary = findMaxSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() == maxSalary) {
                name = employee.getName();
            }
        }
        return name;
    }

    public BigDecimal findMaxSalary() {
        BigDecimal maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary().compareTo(maxSalary) > 0 || employee.getSalary().compareTo(maxSalary) == 0) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
}

