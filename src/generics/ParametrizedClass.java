package generics;
import java.util.*;
public class ParametrizedClass {
    public static void main(String[] args) {
//        Variable<Integer> a = new Variable<>(50);
//        Variable<String> b = new Variable<>("60");
//        int c = a.getValue();
//
//        System.out.println(c);
//
//        Variable_numbers<Integer> variableNumbers = new Variable_numbers<>(10);
//        System.out.println(variableNumbers.getValue());
    }
    public void  example(Variable<Integer> i){
        System.out.println(i.getValue());
    }
//    public void  example(Variable<String> i){
//        System.out.println(i.getValue());
//    }
}
class Variable<A> {
    private A value;
    public Variable(A value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Variable [value=" + value + "]";
    }

    public A getValue() {
        return value;
    }
}
class Variable_numbers<X extends Number>{
    private X value;
    public Variable_numbers(X value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Variable [value=" + value + "]";
    }

    public X getValue() {
        return value;
    }
}
class DemoMap <K,V> {
    private K value1;
    private V value2;

    public K getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    public DemoMap(K value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}