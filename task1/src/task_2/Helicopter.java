package task_2;

public class Helicopter implements TransportCargo{
    private Propeller propeller = new Propeller();
    private Wheels wheels = new Wheels();

    @Override
    public void load() {
        System.out.println("Погрузить в вертолет");
    }

    @Override
    public void transport() {
        System.out.println("Отправить груз вертолетом");
    }

    @Override
    public void unload() {
        System.out.println("Разгрузить вертолет");
    }

    public Propeller getPropeller(){
        return this.propeller;
    }

    public Wheels getWheels(){
        return this.wheels;
    }

}
