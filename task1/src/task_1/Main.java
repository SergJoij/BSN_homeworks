package task_1;

public class Main {
    public static void main(String[] args){
        Cat first = new Cat("Стёпа");
        first.sound();
        first.getSpine().setLongitude(76.1f);

        Bear second = new Bear("Василий");
        second.sound();
        second.getSpine().setLongitude(150.15f);
        second.getFur().setColor("Белый");

        Whale third = new Whale("Кит");
        third.sound();
        third.getSpine().setLongitude(1000.5f);

        System.out.printf("%s, %s\n", first.getClassName(), first.getName());
        System.out.println(first.getSpine().getLongitude());

        System.out.println(second.getClassName());
        System.out.println(second.getFur().getColor());

        System.out.println(third.getClassName());
        third.swim();
        System.out.println(third.getSpine().getLongitude());
    }
}
