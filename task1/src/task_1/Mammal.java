package task_1;

public abstract class Mammal extends Animal{

    protected Spine spine = new Spine();

    public Mammal(String name) {
        super(name);
    }

    public Spine getSpine() {
        return spine;
    }

    protected abstract void sound();
}
