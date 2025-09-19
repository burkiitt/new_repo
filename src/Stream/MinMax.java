package Stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MinMax {
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
        Student min = list.stream()
                .min((a,b)->{
                    return a.getScore()-b.getScore();
                }).get();
        System.out.println(min);


        Student max = list.stream()
                .max((a,b)->{
                    return a.getScore()-b.getScore();
                }).get();
        System.out.println(max);
        System.out.println("----------------------");
        list.stream().sorted((a,b)->a.getScore()-b.getScore()).forEach(System.out::println);
        System.out.println("----------------------");

        list.stream().sorted((a,b)->a.getScore()-b.getScore()).limit(2).forEach(System.out::println);
        System.out.println("----------------------");

        list.stream().sorted((a,b)->a.getScore()-b.getScore()).skip(2).forEach(System.out::println);

    }
}
