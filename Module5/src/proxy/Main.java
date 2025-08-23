package proxy;

public class Main {
    public static void main(String[] args){
        Animal first = new Cat("Степан");
        Animal second = new CatProxy("Василий", "Black", 70);

        for (Animal elem: new Animal[] {first, second}){
            System.out.printf("%s, %s\n", elem.getClassName(), elem.getName());
            elem.clearFur();
        }
    }
}
