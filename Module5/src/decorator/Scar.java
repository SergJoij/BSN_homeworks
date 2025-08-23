package decorator;

public class Scar extends CatDecorator {
    Animal cat;
    String scarDescription;

    public Scar(Animal animal, String scarDescription){
        super(animal);
        this.cat = animal;
        this.scarDescription = scarDescription;
    }

    @Override
    public String fullInfo() {
        return cat.fullInfo() + "\nШрам: " + this.scarDescription;
    }
}
