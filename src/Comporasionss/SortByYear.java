package Comporasionss;

import java.util.Comparator;

public class SortByYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.year-o2.year;
    }
}
