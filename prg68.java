import java.io.*;
class pgm68
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String content = br.readLine();

        FileWriter fr = new FileWriter("output2.txt");
        fr.write(content);

        fr.close();

    }
}