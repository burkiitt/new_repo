package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] list = {1,3,4,5,6,9,8,7,1,3};
        int[] c= Arrays.stream(list).sorted().toArray();
        System.out.println(Arrays.toString(c));
        Student student  = new Student("Berkut", 19,3,'M' , 3);
        Student student2 = new Student("Erasyl", 19,3,'M' , 4);
        Student student3 = new Student("Sholpan", 19,3,'F' , 2);
        List<Student> students = Arrays.asList(student,student2,student3);
        List<Student>  list_total = students.stream().sorted((a,b)->{
            return a.getScore()-b.getScore();
        }).collect(Collectors.toList());
        System.out.println(list_total.toString());

    }
}
