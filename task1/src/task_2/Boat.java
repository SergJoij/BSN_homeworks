package task_2;

public class Boat implements TransportCargo{
    private Propeller propeller = new Propeller();

    @Override
    public void load() {
        System.out.println("Погрузить на катер");
    }

    @Override
    public void transport() {
        System.out.println("Отправить груз на катере");
    }

    @Override
    public void unload() {
        System.out.println("Разгрузить катер");
    }

    public Propeller getPropeller(){
        return this.propeller;
    }

}

