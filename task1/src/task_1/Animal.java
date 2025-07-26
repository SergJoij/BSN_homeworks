package task_1;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    protected String getName(){
        return name;
    }

    protected String getClassName(){
        return "Класс " + this.getClass().getSimpleName();
    };

}
