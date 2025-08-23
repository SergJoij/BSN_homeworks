package strategy;

import strategy.type.Apartment;
import strategy.wall.WallMaterial;

import java.math.BigDecimal;

public class TownHouse extends House{
    public TownHouse(int apartaments, Float square, WallMaterial material){
        this.setWallMaterial(material);
        this.setType(new Apartment(apartaments)); // TownHouse всегда многоквартирный
        this.setSquare(square);
        this.setFloors((short) 1);  //допустим, TownHouse всегда одноэтажный
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal v = BigDecimal.valueOf(getSquare()).multiply(new BigDecimal("22.22"));
        BigDecimal m = this.getWallMaterial().getPrice();
        BigDecimal t = this.getType().getPrice();
        return v.multiply(m).add(t);
    }
}
