package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapp {
    public static void main(String[] args) {
        Student student  = new Student("Berkut", 19,3,'M' , 3);
        Student student2 = new Student("Erasyl",23 ,3,'M' , 4);
        Student student3 = new Student("Sholpan", 19,3,'F' , 2);
        Student student4 = new Student("James", 19,3,'F' , 1);
        Student student5 = new Student("John", 19,3,'M' , 5);
        Student student6 = new Student("Jonita", 19,3,'F' , 2);

        Faculty engine = new Faculty("Enginering");
        engine.addStudent(student);
        engine.addStudent(student2);
        engine.addStudent(student3);

        Faculty engine2 = new Faculty("Edu");
        engine2.addStudent(student4);
        engine2.addStudent(student5);
        engine2.addStudent(student6);

        List<Faculty> list = Arrays.asList(engine, engine2);

        list.stream().flatMap(f->f.getStudents().stream())
                .forEach(e->{
                    System.out.println(e.getName());
                });

    }
}
class Faculty{
    String name;
    List<Student> students;
    Faculty(String name) {
        this.name = name;
        students = new ArrayList<>();
    }
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
}
