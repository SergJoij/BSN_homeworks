package decorator;

import proxy.Fur;

public interface Animal {

    void clearFur();

    String getName();

    String getClassName();

    Fur getFur();

    String getBaseCharacter();

    void setBaseCharacter(String character);

    String fullInfo();
}
