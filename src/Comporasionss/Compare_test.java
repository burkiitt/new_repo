package Comporasionss;

import java.util.*;

public class Compare_test {
    public static void main(String[] args) {
        List<Car> list1 = new ArrayList<Car>();
        list1.add(new Car("cobalt",2024,"White"));
        list1.add(new Car("cobalttt",2025,"White"));
        list1.add(new Car("cobaltttttt",2020,"White"));
        System.out.println(list1);
        Collections.sort(list1,new SortByYear());
        System.out.println(list1);
    }
}
