package strategy.wall;

import java.math.BigDecimal;

public class Wooden implements WallMaterial{
    private final Byte FIREHAZARD = 3;

    @Override
    public String getWallMaterial() {
        return "������";
    }

    @Override
    public Byte getFireHazard() {
        return FIREHAZARD;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("5609");
    }
}
