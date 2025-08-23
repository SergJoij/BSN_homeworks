package chain_of_responsibility;

import java.util.Map;


public class Main {
    public static void main(String[] args){
        Map<String, Integer> sortedDocs = Map.of("Прецеденты.docx", 1,
                "VM 1.docx", 1,
                "VM 2.docx", 2,
                "VM 3.docx", 3,
                "VM 2: дополнительный протокол.docx", 3,
                "VM4.docx", 4,
                "Ключ.tex", 4);

        Person p1 = new Person("Никита", 2);
        Person p2 = new Person("Вася");
        Person p3 = new Person("Алексей", 4);

        AccessSender as1 = new AccessSender1(1);
        AccessSender as2 = new AccessSender2(2, as1);
        AccessSender as3 = new AccessSender3(3, as2);
        AccessSender as4 = new AccessSender4(4, as3);

        takeDocs(p1, as4, sortedDocs);
        takeDocs(p2, as4, sortedDocs);
        takeDocs(p3, as4, sortedDocs);
    }

    public static void takeDocs(Person person, AccessSender as, Map<String, Integer> sortedDocs){
        as.accessManager(sortedDocs, person.getClearanceLevel());
    }
}
