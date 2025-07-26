package task_1;

public class Bear extends Mammal{
    protected Fur fur = new Fur();

    public Bear(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Р-р-р-р");
    }

    public Fur getFur(){
        return this.fur;
    }
}
