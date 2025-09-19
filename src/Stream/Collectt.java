package Stream;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectt {
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

        Map<Boolean,List<Student>> map = list.stream()
                .collect(Collectors.partitioningBy(a->a.getScore()>3));
        for(Map.Entry<Boolean,List<Student>> ss : map.entrySet()){
            System.out.println(ss.getKey()+" "+ss.getValue());
        }

        Map<Integer,List<Student>> map2= list.stream()
                .collect(Collectors.groupingBy(e->e.getCourse()));
        for(Map.Entry<Integer,List<Student>> ss : map2.entrySet()){
            System.out.println(ss.getKey()+" "+ss.getValue());
        }
    }
}
