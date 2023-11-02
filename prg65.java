//demo of file reading

import java.io.*;
class pgm65
{
    public static void main(String args[])throws IOException
    {
        int ch;
        FileInputStream fin = new FileInputStream("output.txt");

        while((ch=fin.read())!=-1)
        System.out.print((char)ch);

        fin.close();
    }
}