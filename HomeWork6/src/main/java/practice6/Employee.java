package practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public abstract class Employee {
    private String name;
    private BigDecimal salary;
    private BigDecimal bonus;


    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setterForBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public abstract void setBonus(BigDecimal bonus);


    public BigDecimal toPay() {
        BigDecimal total = BigDecimal.ZERO;
        if (salary != null && bonus != null) {
            total = salary.add(bonus);
        }
        return total;
    }
}
