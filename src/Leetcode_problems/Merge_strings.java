package Leetcode_problems;

public class Merge_strings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st  =new StringBuilder();
        int lenght = Math.min(word1.length(), word2.length());
        int a=0,b=0;
        for(int i=0;i<lenght;i++){
            st.append(word1.charAt(a));
            st.append(word2.charAt(b));
            a++;
            b++;
        }
        if(word2.length()>word1.length()){
            for(int i=b;i<word2.length();i++){
                st.append(word2.charAt(i));
            }
        }
        else if(word1.length()>word2.length()){
            for(int i=a;i<word1.length();i++){
                st.append(word1.charAt(i));
            }
        }
        return st.toString();
    }
}
class Test{
    public static void main(String[] args) {
        Merge_strings m=new Merge_strings();
        System.out.println(m.mergeAlternately("abc","pqr"));
        System.out.println(m.mergeAlternately("abcd","qr"));
        System.out.println(m.mergeAlternately("ab","cpqr"));
    }
}
