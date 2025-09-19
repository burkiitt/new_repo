package lambda_expression;
interface Len_word{
    int abc(String str,int  b);
}
public class Test {
    static int b;
    public static void def(Len_word word) {
        System.out.println(word.abc("hello",b));
    }

    public static void main(String[] args) {
        int a=5;
        def((String s,int c)->{
            c=100;
            return s.length()+a;
        });
        System.out.println(b);
    }
}
