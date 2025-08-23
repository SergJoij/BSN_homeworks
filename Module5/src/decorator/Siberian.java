package decorator;

public class Siberian extends CatDecorator {
    Animal cat;

    public Siberian(Animal animal){
        super(animal, "Чёрный, коричневый, серый", "Спокойный");
        this.cat = animal;
    }

    @Override
    public String fullInfo() {
        return cat.fullInfo() + "\nПорода: сибирская";
    }
}
