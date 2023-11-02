//demo of buffered output stream
import java.io.*;
public class pgm75
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream file = new FileOutputStream("out1.txt");
        BufferedOutputStream data = new BufferedOutputStream(file);
        String s = "Welcome to JAVA";
        byte b[] = s.getBytes();
        data.write(b);
        data.flush();
        data.close();
        System.out.println("Success...");
    }
}
