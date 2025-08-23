package strategy;

import strategy.type.Individual;
import strategy.wall.WallMaterial;

import java.math.BigDecimal;

public class Mansion extends House{

    public Mansion(int floors, Float square, WallMaterial material){
        this.setFloors((short) floors);
        this.setWallMaterial(material);
        this.setType(new Individual());  //особняк - всегда индивидуальное жильё
        this.setSquare(square);
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal v = BigDecimal.valueOf(getSquare()).multiply(BigDecimal.valueOf(getFloors()))
                .multiply(new BigDecimal("22.22"));
        BigDecimal m = this.getWallMaterial().getPrice();
        BigDecimal t = this.getType().getPrice();
        return v.multiply(m).add(t);
    }
}
