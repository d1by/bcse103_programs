//read the primitive data types using IO package and display the same in the monitor
import java.io.*;
class pgm64
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter integer data type");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Enter double data type");
        double num1 = Double.parseDouble(br.readLine());

        System.out.println("Enter long data type");
        long num2 = Long.parseLong(br.readLine());

        System.out.println("Enter short data type");
        short num3= Short.parseShort(br.readLine());

        System.out.println("Enter float data type");
        float num4 = Float.parseFloat(br.readLine());

        System.out.println("Enter byte data type");
        byte num5 = Byte.parseByte(br.readLine());

        System.out.println("Enter string data type");
        String str = br.readLine();

        System.out.println("Enter character data type");
        String str1 = br.readLine();
        char ch = str1.charAt(0);

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(str);
        System.out.println(ch);

    }
}