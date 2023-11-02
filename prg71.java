//pgm 71
import java.io.*;
import java.util.*;
public class pgm71
{
    public static void main(String args[])
    {
        if(args.length==0)
        {
            System.out.println("No files have been submitted");
            return ;
        }
        for(int i = 0;i<args.length;i++)
        {
            System.out.print(args[i]+" : ");
            countLines(args[i]);
        }
    }

    static void countLines(String fileName)
    {
        int count=0;
        try{
            //create a new file object
            File file = new File(fileName);
            //create an object of scanner
            //associated with the file
            Scanner sn  = new Scanner(file);
            //read each line
            //count number of lines

            while(sn.hasNextLine()){
                sn.nextLine();
                count++;
            }
            System.out.println("Total number of lines:" + count);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}