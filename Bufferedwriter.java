import java.io.*;

public class Bufferedwriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new FileWriter("W:/javavsc/write1.txt", true));
        bf.write("hellofrombuffer");
        bf.close();
    }
}
