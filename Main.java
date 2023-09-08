import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements Constants {
    public static void main(String[] args) {
        Cat cat = new Cat(null, null);
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Карамелька", 7, "Аня"));
        cats.add(new Cat("Компот", 12, "Вася"));
        cats.add(new Cat("Коржик", 9, "Александр"));

        cat.setName(cat_name);
        cat.setAge(cat_age);
        cat.setOwnerName(owner_name);
        cat.greet();

        Predicate<Integer> vaccination_age = ageValue -> ageValue > vaccination_cat_age;
        boolean result = vaccination_age.test(cat.getAge());
        if (result) {
            System.out.println(cat.getName() + ", 'Вам пора сделать вакцинацию'!");
        }

        cat.makeSound();
        cat.callAnimal();

        System.out.println("\n До сортировки: ");
        for (Cat item : cats) {
            System.out.println(item);
        }

        Comparator<Cat> ageComparator = Comparator.comparingInt(item -> item.getAge());
        Collections.sort(cats, ageComparator);

        System.out.println("\n После сортировки по возрасту: ");
        for (Cat item : cats) {
            System.out.println(item);
        }
    }
}
