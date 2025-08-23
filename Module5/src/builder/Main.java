package builder;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        final Logger logger = Logger.getLogger(decorator.Main.class.getName());

        House h1 = new House.HouseBuilder(200f, (short) 5).build();
        House h2 = new House.HouseBuilder(146f, (short) 2).setYearOfLR((short) 2013).build();
        House h3 = new House.HouseBuilder(702f, (short) 4).setYearOfLR((short) 1986)
                .setDescriptionOfLR("Подкрашен фасад").build();

        logger.info(h1.fullInfo());
        logger.info(h2.fullInfo());
        logger.info(h3.fullInfo());
    }
}
