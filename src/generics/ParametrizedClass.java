package generics;
import java.util.*;
public class ParametrizedClass {
    public static void main(String[] args) {
        Variable<Integer> a = new Variable<>(50);
        Variable<String> b = new Variable<>("60");
        int c = a.getValue();
        
        System.out.println(c);
    }
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