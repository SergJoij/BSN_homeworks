package task_1;

public class Cat extends Mammal{
    protected Fur fur = new Fur();

    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Мяу");
    }

    public Fur getFur(){
        return this.fur;
    }
}
