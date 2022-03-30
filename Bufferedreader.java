import java.io.IOException;
import java.io.*;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("W:/javavsc/write1.txt"));
        int i;
        String line;
        line = br.readLine(); //readLine() method reads the line from the file and returns the line as a string
        System.out.println("line" + line);
        while((line = br.readLine()) != null) {
            System.out.println("line" + line);
        }
        do {
            i = br.read();
            System.out.print((char) i);
        } while (i != -1);

        char[] s = new char[20];
        br.read(s, 6, 2);
        System.out.println(s);
        
        br.close();
    }
}
