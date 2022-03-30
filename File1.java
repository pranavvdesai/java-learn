import java.io.*;
public class File1 {
    public static void main(String[] args) throws IOException {
        
        File f = new File("write1.txt");
        f.createNewFile();
        FileOutputStream fout = new FileOutputStream(f, true);
        FileOutputStream fout1 = new FileOutputStream("W:/javavsc/fout1.txt", true);
        String s = "\nHello 4";
        for(int i = 0; i < s.length(); i++) {
            fout.write(s.charAt(i));
        }
        fout.close();
    }
}
