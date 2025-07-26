package task_1;

public abstract class Fish extends Animal implements Water{
    public Fish(String name) {
        super(name);
    }

    public void swim(){
        System.out.println("Плыву");
    }
}
