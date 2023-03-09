package homework_3.comparator;

import java.util.Comparator;
import homework_3.src.Human;

public class HumanComporatorByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
