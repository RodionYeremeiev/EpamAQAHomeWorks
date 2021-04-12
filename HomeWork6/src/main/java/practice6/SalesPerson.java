package practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal rate = BigDecimal.ONE;
        if (this.percent > 200) {
            rate = new BigDecimal(3);
        }
        if (this.percent > 100 && this.percent <= 200) {
            rate = new BigDecimal(2);
        }

        super.setterForBonus(bonus.multiply(rate));
    }

}
