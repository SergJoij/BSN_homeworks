package task_2;

public class Plane implements TransportCargo{
    private Propeller propeller = new Propeller();
    private Wheels wheels = new Wheels();
    private Wings wings = new Wings(20f);


    @Override
    public void load() {
        System.out.println("Погрузить в самолёт");
    }

    @Override
    public void transport() {
        System.out.println("Отправить груз самолётом");
    }

    @Override
    public void unload() {
        System.out.println("Разгрузить самолёт");
    }

    public Propeller getPropeller(){
        return this.propeller;
    }

    public Wheels getWheels(){
        return this.wheels;
    }

    public Wings getWings(){
        return this.wings;
    }

}

