package proxy;

public class Fur {
    private String color;
    private Byte condition;

    public Fur(){
        this.condition = 76;
    }

    public Fur (String color, Integer condition){
        this(color, condition.byteValue());
    }

    public Fur (String color, Byte condition){
        this.color = color;
        this.condition = condition;
    }

    public void clearFur(){
        this.condition = 100;
    }

    public Byte getCondition() {
        return condition;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String col){
        this.color = col;
    }
}
