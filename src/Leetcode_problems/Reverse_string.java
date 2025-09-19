package Leetcode_problems;
public class Reverse_string {
    public String reverseWords(String s) {
        StringBuilder st = new StringBuilder();
        boolean isfirdtspace=false;
        for (char c : s.toCharArray()) {
            if(c!=' '){
                st.append(c);
                isfirdtspace=true;
            }
            else if (isfirdtspace){
                st.append(' ');
                isfirdtspace=false;
            }
        }
        String[] list = st.toString().split(" ");
        st=new StringBuilder();
        for (int i=list.length-1; i>=0; i--) {
            st.append(list[i]);
            if(i!=0){
                st.append(" ");
            }
        }
        return st.toString();
    }
}
class Test_reverse{
    public static void main(String[] args) {
        Reverse_string r = new Reverse_string();
        System.out.println(r.reverseWords("  hello world  "));
    }
}