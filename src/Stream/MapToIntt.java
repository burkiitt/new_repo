package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntt {
    public static void main(String[] args) {
        Student student  = new Student("Berkut", 19,3,'M' , 3);
        Student student2 = new Student("Erasyl",23 ,2,'M' , 4);
        Student student3 = new Student("Sholpan", 19,3,'F' , 2);
        Student student4 = new Student("James", 19,3,'F' , 1);
        Student student5 = new Student("John", 19,2,'M' , 5);
        Student student6 = new Student("Jonita", 19,2,'F' , 2);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        List<Integer> arr = list.stream().mapToInt(Student::getScore).boxed().collect(Collectors.toList());
        System.out.println(arr);
        System.out.println("-------------------");
        int a = list.stream().mapToInt(Student::getScore).sum();
        System.out.println(a);
        System.out.println("-------------------");
        int b = list.stream().mapToInt(el->el.getScore()).min().getAsInt();
        System.out.println(b);
        System.out.println("-------------------");
        int c = list.stream().mapToInt(el->el.getScore()).max().getAsInt();
        System.out.println(c);
        System.out.println("-------------------");
        double d = list.stream().mapToInt(el->el.getScore()).average().getAsDouble();
        System.out.println(d);


    }
}
