import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class cat25 {
    public static void main(String[] args) {
        try {
            FileInputStream fo = new FileInputStream("ex.txt");
            while (true) {
                int i = fo.read();
                if (i == -1) {
                    break;
                }
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
