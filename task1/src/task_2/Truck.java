package task_2;

public class Truck implements TransportCargo{
    private Wheels wheels = new Wheels();

    @Override
    public void load() {
        System.out.println("Погрузить в грузовик");
    }

    @Override
    public void transport() {
        System.out.println("Перевезти грузовиком");
    }

    @Override
    public void unload() {
        System.out.println("Разгрузить грузовик");
    }

    public Wheels getWheels(){
        return this.wheels;
    }

}

