package chain_of_responsibility;

import java.util.Map;

public class AccessSender3 extends AccessSender{

    public AccessSender3(int clearanceLevel, AccessSender nextSender) {
        super(clearanceLevel, nextSender);
    }

    @Override
    public void accessManager(Map<String, Integer> docList, int userLevel) {
        if (userLevel >= clearanceLevel)
            docList.entrySet().stream()
                    .filter(elem -> elem.getValue().byteValue() == clearanceLevel)
                    .forEach(elem -> System.out.println(elem.getKey()));

        nextSender.accessManager(docList, userLevel);
    }
}
