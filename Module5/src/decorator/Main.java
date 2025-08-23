package decorator;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        final Logger logger = Logger.getLogger(Main.class.getName());

        Animal first = new Cat("Степан");

        Animal cat1 = new Cat("Мурзик");
        Animal second = new Siberian(cat1);

        Animal cat2 = new Cat("Кеша");
        Animal siamese = new Siamese(cat2);
        Animal third = new Scar(siamese, "Небольшой, на спине");

        logger.info(first.fullInfo());
        logger.info(second.fullInfo());
        logger.info(third.fullInfo());
    }
}
