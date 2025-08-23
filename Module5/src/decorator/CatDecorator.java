package decorator;

import proxy.Fur;

import java.util.logging.Logger;

public class CatDecorator implements Animal {
    private Animal animal;
    private final Logger logger = Logger.getLogger(CatDecorator.class.getName());

    public CatDecorator(Animal animal) {
        this.animal = animal;
    }

    public CatDecorator(Animal animal, String furColor, String character) {
        this.animal = animal;
        this.animal.getFur().setColor(furColor);
        this.animal.setBaseCharacter(character);
    }

    @Override
    public void clearFur(){
        logger.info("Кот " + getName() + " начинает умываться. Состояние шерсти: " + getFur().getCondition().toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.info("Кот " + getName() + " не смог умыться.");
            e.printStackTrace();
        }
        animal.getFur().clearFur();
        logger.info("Кот " + getName() + " помылся. Состояние шерсти: " + getFur().getCondition().toString() );
    }

    @Override
    public String getName() {
        return animal.getName();
    }

    @Override
    public String getClassName() {
        return "Класс " + this.getClass().getSimpleName();
    }

    @Override
    public Fur getFur(){
        return animal.getFur();
    }

    @Override
    public String getBaseCharacter(){
        return animal.getBaseCharacter();
    }

    @Override
    public void setBaseCharacter(String character) {
        animal.setBaseCharacter(character);
    }

    @Override
    public String fullInfo() {
        return String.format("Имя: %s\nХарактер: %s\nШерсть\nСостояние: %d; Цвет: %s", animal.getName(),
                animal.getBaseCharacter(), animal.getFur().getCondition(), animal.getFur().getColor());
    }

}
