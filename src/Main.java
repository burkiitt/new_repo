//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class A{
    @MyAnno
    public void calculate(){
        System.out.println("A-B");
    }
}
class B extends A{
    @Override
    public void calculate(){
        System.out.println("A+B");
    }
}
public class Main {
    public static void main(String[] args) {
        String s = "a b c";
        System.out.println(s.split(" ")[0]);
    }
}