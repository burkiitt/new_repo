package Leetcode_problems;
import java.util.*;
public class Reverse_Vowels {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        ArrayList<Character> list=new ArrayList<>();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                list.add(c);
            }
        }
        int len=list.size()-1;
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                sb.append(list.get(len));
                len=len-1;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
class Test2{
    public static void main(String[] args) {
        Reverse_Vowels obj=new Reverse_Vowels();
        System.out.println(obj.reverseVowels("IceCreAm"));
    }
}
