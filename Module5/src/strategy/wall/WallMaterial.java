package strategy.wall;

import java.math.BigDecimal;

public interface WallMaterial {
    String getWallMaterial();

    Byte getFireHazard(); // ���������������: �� 0 �� 3

    BigDecimal getPrice();
}
