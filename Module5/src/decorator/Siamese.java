package decorator;

import java.util.logging.Logger;

public class Siamese extends CatDecorator {
    Animal cat;

    public Siamese(Animal animal){
        super(animal, "Кремовый, коричневый", "Эмоциональный");
        this.cat = animal;
    }

    @Override
    public String fullInfo() {
        return cat.fullInfo() + "\nПорода: сиамская";
    }
}
