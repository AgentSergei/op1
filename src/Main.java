import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание персон
        Person person1 = new Person("Anton");
        Person person2 = new Person("Baton");
        Person person3 = new Person("Camila");
        Person person4 = new Person("David");

        // Связывание персон в генеалогическое древо
        person1.addChild(person2);
        person1.addChild(person3);
        person2.addChild(person4);

        // Создание генеалогического древа с корневым персоном
        FamilyTree familyTree = new FamilyTree(person1);

        // Исследование - получение всех детей выбранного человека
        List<Person> allChildren = Research.getAllChildren(person1);
        System.out.println("Все дети выбранного человека:");
        for (Person child : allChildren) {
            System.out.println(child.getName());
        }
    }
}