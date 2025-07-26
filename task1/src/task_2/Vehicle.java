package task_2;

public class Vehicle {
    private Plane plane = new Plane();
    private Helicopter helicopter = new Helicopter();
    private Truck truck = new Truck();
    private Tanker tanker = new Tanker();
    private Boat boat = new Boat();
    private Taxi taxi = new Taxi();

    public Plane getPlane(){
        return this.plane;
    }

    public Helicopter getHelicopter(){
        return this.helicopter;
    }

    public Truck getTruck(){
        return this.truck;
    }

    public Tanker getTanker(){
        return this.tanker;
    }

    public Boat getBoat(){
        return this.boat;
    }

    public Taxi getTaxi(){
        return this.taxi;
    }
}
