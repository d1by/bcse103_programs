import java.io.*;
class pgm69
{
    public static void main(String args[])throws IOException
    {
        int ch;
        FileReader fr = new FileReader("pgm68.java");

        while((ch=fr.read())!=-1)
        System.out.print((char)ch);

        fr.close();

    }
}