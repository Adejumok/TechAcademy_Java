package intro;

import java.io.FileReader;
import java.io.IOException;
public class TryWithDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Users\\rose.adeyinka\\OneDrive - Interswitch Limited\\Desktop\\file.txt")) {
            char[] a = new char[50];
            fr.read(a);  //reads the content to the array
            for (char c : a) System.out.print(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
