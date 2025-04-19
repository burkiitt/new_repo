import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestFIleStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("numbers.txt");
            fos.write("Hello World".getBytes());
            FileInputStream in = new FileInputStream("numbers.txt");
            byte[] buffer = new byte [5];
            int n = in.read(buffer);
            String str = new String(buffer);
            System.out.println(str);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
