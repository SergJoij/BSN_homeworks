package strategy;

import strategy.type.Type;
import strategy.wall.WallMaterial;

import java.math.BigDecimal;

public abstract class House {
    private Float square;     // m2
    private Type type;
    private WallMaterial wallMaterial;
    private Short floors;


    public Float getSquare() {
        return this.square;
    }

    public Type getType() {
        return this.type;
    }

    public WallMaterial getWallMaterial() {
        return this.wallMaterial;
    }

    public Short getFloors() {
        return floors;
    }

    public void setFloors(Short floors) {
        this.floors = floors;
    }

    public void setWallMaterial(WallMaterial material){
        this.wallMaterial = material;
    }

    public void setType(Type type){
        this.type = type;
    }

    public void setSquare(Float square){
        this.square = square;
    }

    public abstract BigDecimal getPrice();
}
