package lambda_expression;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Function;

interface Check_condition{
    public boolean check(Student s);
}
class Gpa_3 implements Check_condition{
    @Override
    public boolean check(Student s) {
        return s.grade>=3;
    }
}
public class Student_test {
    public static double ave_age(List<Student> students,Function<Student,Double> grade){
        double avg = 0;
        for(Student s : students){
            avg +=grade.apply(s);
        }
        return avg/students.size();
    }
    public static void main(String[] args) {
        Student student1 = new Student("Berkut",19,3.5,"M");
        Student student2 = new Student("Kaiser",20,3.7,"M");
        Student student3 = new Student("Aiym",19,3,"F");
        Student student4 = new Student("John",19,2,"M");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        double result = ave_age(students,(Student s)->{return s.grade;});
        System.out.println(result);
//        Collections.sort(students,new Comparator<Student>(){
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.age-o2.age;
//            }
//        });
//        System.out.println(students);
//        System.out.println("----------------------------");
//        Collections.sort(students,(Student s1 , Student s2)->{
//            return s1.age-s2.age;
//        });
//        System.out.println(students);
//        System.out.println("----------------------------");

        Student_test student_test = new Student_test();
//        student_test.check_students(students,new Gpa_3());
//        System.out.println("----------------------------");
//        student_test.check_students(students,new Check_condition() {
//            @Override
//            public boolean check(Student s) {
//                return s.gender.equals("M");
//            }
//        });
//        System.out.println("----------------------------");
//        student_test.check_students(students,(Student s)->{return s.age>=20;});
//        Predicate<Student> p1 = p->p.grade>=3;
//        Predicate<Student> p2 = p->p.age>=19;
//        student_test.check_students(students,p1.negate());
    }
    void check_students(ArrayList<Student> array,Predicate<Student> predicate) {
        for(Student s : array){
            if(predicate.test(s)){
                System.out.println(s);
            }
        }
    }
}