package task_2;

public class Tanker implements TransportCargo{
    private Propeller propeller = new Propeller();

    @Override
    public void load() {
        System.out.println("Загрузить танкер");
    }

    @Override
    public void transport() {
        System.out.println("Отправить груз на танкере");
    }

    @Override
    public void unload() {
        System.out.println("Разгрузить танкер");
    }

    public Propeller getPropeller(){
        return this.propeller;
    }
}

