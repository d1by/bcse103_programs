/* Yeswant wants to submit a short story for a competition but hsi document should meet the word count provided.
 * help Yeswant get the exact word count required
 */
import java.io.*;
class pgm70
{
    public static void main(String args[])throws IOException
    {
        long nl=0,nw=0,nc=0;
        String line;
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        while((line=br.readLine())!=null)
        {
            nl++;
            nc=nc+line.length();
            int i=0;
            boolean pspace=true;
            while(i<line.length())
            {
                char c = line.charAt(i++);
                boolean cspace=Character.isWhitespace(c);
                if(pspace && !cspace)
                    nw++;
                pspace=cspace;
            }
        }
        System.out.println("Number of characters " + nc);
        System.out.println("Number of lines " + nl);
        System.out.println("Number of words " + nw);
        br.close();
    }
}