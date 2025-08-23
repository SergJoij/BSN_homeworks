package proxy;

public class Cat implements Animal{
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
    public String getClassName(){
        return "Класс " + this.getClass().getSimpleName();
    };
}
