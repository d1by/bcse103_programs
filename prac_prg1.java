import java.io.*;

public class prac_prg1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1...Read File\n2...Write File\n3...Append to File");
        int choice = Integer.parseInt(br.readLine());

        if(choice==1){
            System.out.println("Enter file name: ");
            String fname = br.readLine();

            int ch;
            FileReader f = new FileReader(fname);
            while((ch=f.read())!=-1)
                System.out.print((char)ch);
            
            f.close();
        }

        else if(choice==2){
            System.out.println("Enter content: ");
            String content = br.readLine();
            
            FileWriter f = new FileWriter("prac1_out.txt");
            f.write(content);
            f.close();
        }

        else if(choice==3){
            System.out.println("Enter file name: ");
            String fname = br.readLine();
            System.out.println("Enter content: ");
            String content = br.readLine();
            
            FileWriter f = new FileWriter(fname, true);
            f.write(content);
            f.close();
        }

    }
}
