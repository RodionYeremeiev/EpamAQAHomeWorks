package practice6;

import java.math.BigDecimal;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Manager extends Employee {
    private int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        this.quantity = clientAmount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal rate = BigDecimal.ZERO;

        if (quantity > 150) {
            rate = new BigDecimal(1000);
        }

        if (quantity <= 150 && quantity > 100) {
            rate = new BigDecimal(500);
        }

        super.setterForBonus(bonus.add(rate));
    }
}
