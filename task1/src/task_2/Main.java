package task_2;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();

        System.out.println(vehicle.getPlane().getWings().getLength());
        vehicle.getPlane().getWheels().setDiameter(10);
        System.out.println(vehicle.getPlane().getWheels().getDiameter());

        vehicle.getHelicopter().load();
        vehicle.getHelicopter().transport();
        vehicle.getHelicopter().unload();
        System.out.println(vehicle.getHelicopter().getPropeller().getDiameter());
    }
}
