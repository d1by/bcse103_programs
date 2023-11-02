//demo of data output stream
import java.io.*;
public class pgm73
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream file = new FileOutputStream("out.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Success...");
    }
}