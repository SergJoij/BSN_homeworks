package strategy.wall;

import java.math.BigDecimal;

public class Brick implements WallMaterial{
    private final Byte FIREHAZARD = 1;

    @Override
    public String getWallMaterial() {
        return "Кирпич";
    }

    @Override
    public Byte getFireHazard() {
        return FIREHAZARD;
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("9199");
    }
}
