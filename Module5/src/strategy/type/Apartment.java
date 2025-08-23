package strategy.type;

import java.math.BigDecimal;

public class Apartment implements Type{
    private Integer apartmentsNumber;

    public Apartment(){
        this.apartmentsNumber = 2;
    }

    public Apartment(Integer number){
        this.apartmentsNumber = number;
    }

    @Override
    public Integer getNumberOfApartaments() {
        return this.apartmentsNumber;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(apartmentsNumber).multiply(new BigDecimal("20179"));
    }
}
