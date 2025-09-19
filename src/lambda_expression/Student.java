package lambda_expression;

public class Student {
    String name ;
    double age ;
    double grade;
    String gender;

    public Student(String name, double age, double grade, String gender) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade;
    }
}
