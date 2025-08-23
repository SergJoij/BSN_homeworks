package chain_of_responsibility;

import java.util.Map;

public class AccessSender1 extends AccessSender{

    public AccessSender1(int clearanceLevel) {
        super(clearanceLevel);
    }

    public void accessManager(Map<String, Integer> docList, int userLevel){
        if (userLevel >= clearanceLevel)
            docList.entrySet().stream()
                    .filter(elem -> elem.getValue().byteValue() == clearanceLevel)
                    .forEach(elem -> System.out.println(elem.getKey()));
        System.out.println();
    }
}
