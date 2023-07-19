package next;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreams {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = b.readLine();
        System.out.print("Enter your other name: ");
        int otherName = b.read();
        int lastName = b.read();
        System.out.println("ReadLine(): "+ name);
        System.out.println("Read(): "+ otherName+"["+String.format("%s]", (char) otherName));
        System.out.println("Read() byte: "+lastName);
    }
}
