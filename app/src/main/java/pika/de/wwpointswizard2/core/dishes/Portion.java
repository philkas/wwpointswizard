package pika.de.wwpointswizard2.core.dishes;

import java.math.BigDecimal;

/**
 * Created by pika on 18.06.15.
 */
public class Portion {
    BigDecimal amount;
    PortionUnit unit;

    public Portion(BigDecimal amount, PortionUnit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public Portion(double amount, PortionUnit unit) {
        this(new BigDecimal(amount), unit);
    }

    @Override
    public String toString() {
        return amount.toString().concat(" ").concat(unit.getShortname());
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PortionUnit getUnit() {
        return unit;
    }

    public void setUnit(PortionUnit unit) {
        this.unit = unit;
    }
}
