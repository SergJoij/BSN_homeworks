package strategy.wall;

import java.math.BigDecimal;

public interface WallMaterial {
    String getWallMaterial();

    Byte getFireHazard(); // пожароопасность: от 0 до 3

    BigDecimal getPrice();
}
