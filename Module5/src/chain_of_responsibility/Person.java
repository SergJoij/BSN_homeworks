package chain_of_responsibility;

public class Person {
    private Byte clearanceLevel;
    private String name;

    public Person(String name, Integer level){
        this.name = name;
        this.clearanceLevel = level.byteValue();
    }

    public Person(String name){
        this.name = name;
        this.clearanceLevel = 0;
    }

    public Byte getClearanceLevel() {
        return clearanceLevel;
    }
}
