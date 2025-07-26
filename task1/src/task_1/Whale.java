package task_1;

public class Whale extends Mammal implements Water{

     public Whale(String name){
         super(name);
     }

    @Override
    protected void sound() {
        System.out.println("У-у-у-у-уу");
    }


    @Override
    public void swim() {
        System.out.println("Плыву-у-у-у-у");
    }
}
