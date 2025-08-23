package chain_of_responsibility;

import java.util.Map;

public class AccessSender4 extends AccessSender{

    public AccessSender4(int clearanceLevel, AccessSender nextSender) {
        super(clearanceLevel, nextSender);
    }

    @Override
    public void accessManager(Map<String, Integer> docList, int userLevel) {
        if (userLevel == clearanceLevel)
            docList.entrySet().stream()
                    .filter(elem -> elem.getValue().byteValue() == clearanceLevel)
                    .forEach(elem -> System.out.println(elem.getKey()));

        nextSender.accessManager(docList, userLevel);
    }
}
