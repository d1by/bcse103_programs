//demo of file writing
import java.io.*;
class pgm67
{
    public static void main(String args[])throws IOException
    {
        String content = ("Hello Welcome to India!");

        FileWriter f = new FileWriter("output1.txt");
         f.write(content);
         f.close();
    }
}