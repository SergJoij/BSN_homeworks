package strategy.type;

import java.math.BigDecimal;

public class Individual implements Type {
    private final Integer apartmentsNumber = 1;

    @Override
    public Integer getNumberOfApartaments() {
        return this.apartmentsNumber;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("20180");
    }
}
