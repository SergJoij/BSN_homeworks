package proxy;

import java.util.logging.Logger;

public class CatProxy implements Animal{
    private Animal cat;
    private final Logger logger = Logger.getLogger(CatProxy.class.getName());

    public CatProxy(String name, String color, Integer condition){
        cat = new Cat(name, color, condition);
    }

    public CatProxy(String name) {
        cat = new Cat(name);
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
        cat.getFur().clearFur();
        logger.info("Кот " + getName() + " помылся. Состояние шерсти: " + getFur().getCondition().toString() );
    }

    @Override
    public String getName() {
        return cat.getName();
    }

    @Override
    public String getClassName() {
        return "Класс " + this.getClass().getSimpleName();
    }

    @Override
    public Fur getFur(){
        return cat.getFur();
    }
}
