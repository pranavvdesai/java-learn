import java.io.*;

public class FileInput {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("W:/javavsc/write1.txt");
        int i;
        do {
            i = fin.read();
            System.out.print((char) i);
        } while (i != -1);
        fin.close();

    }
}
