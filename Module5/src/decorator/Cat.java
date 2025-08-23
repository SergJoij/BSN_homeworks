package decorator;

import proxy.Fur;

import java.util.logging.Logger;

public class Cat implements Animal {
    private final Logger logger = Logger.getLogger(Cat.class.getName());
    protected String baseCharacter;
    protected Fur fur;
    protected String name;

    public Cat(String name){
        //this(name, "White", 80);
        this.name = name;
        this.fur = new Fur();
    }

    public Cat(String name, String color, Integer condition){
        this.name = name;
        this.fur = new Fur(color, condition);
    }

    @Override
    public void clearFur(){
        this.getFur().clearFur();
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Fur getFur(){
        return this.fur;
    }

    @Override
    public String getBaseCharacter() {
        return this.baseCharacter;
    }

    @Override
    public void setBaseCharacter(String character) {
        this.baseCharacter = character;
    }

    @Override
    public String fullInfo() {
        return String.format("Имя: %s\nХарактер: %s\nШерсть\nСостояние: %d; Цвет: %s", getName(),
                getBaseCharacter(), getFur().getCondition(), getFur().getColor());
    }

    @Override
    public String getClassName(){
        return "Класс " + this.getClass().getSimpleName();
    };
}
