package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Test2 {
    public static void main(String[] args) {
        Student student  = new Student("berkut", 19,3,'M' , 3);
        Student student2 = new Student("erasyl", 19,3,'M' , 4);
        Student student3 = new Student("sholpan", 19,3,'F' , 2);
        List<Student> list = new ArrayList();
        list.add(student);
        list.add(student2);
        list.add(student3);
//        List<Student> new_list = list.stream().filter(a-> a.getCourse()>2 && a.getGender()=='F').collect(Collectors.toList());
//        System.out.println(new_list);
        List<Student> students = list.stream().sorted((a,b)->{
            return a.getScore()-b.getScore();
        }).collect(Collectors.toList());
        //System.out.println(students);
        //about chaining
        List<Student> chain = list.stream().map(element->{
            element.setName(element.getName().substring(0,1).toUpperCase()+element.getName().substring(1));
            return element;
        })
                .filter(element->element.getGender()=='M')
                .sorted((a,b)->{
                    return a.getScore()-b.getScore();
                })
                .collect(Collectors.toList());
        System.out.println(chain);
    }
}
class Student{
    private String name;
    private int age;
    private int course;
    private char gender;
    private int score;

    public Student(String name, int age, int course, char gender, int score) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.gender = gender;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }
}
