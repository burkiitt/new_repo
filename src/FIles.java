import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FIles {
    public static void main(String[] args) throws IOException {
        try{
//            PrintWriter out = new PrintWriter("src/example.txt");
//            out.print("Hello World");
//            out.close();
            Scanner sc = new Scanner(new File("example.txt"));
            Map<Character,Integer> map = new HashMap<>();
            while(sc.hasNext()){
                String s = sc.nextLine();

                for(char c : s.toCharArray()){
                    if(map.containsKey(c) && c!=' '){
                        map.put(c,map.get(c)+1);
                    }
                    else{
                        map.put(c,1);
                    }
                }
            }
            for(char c : map.keySet()){
                System.out.println(c + " : " + map.get(c));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
