import java.io.*;

public class prac_prg2 implements Serializable{
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        Student std1 = new Student();

        FileOutputStream fos = new FileOutputStream("prac_2_out.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(std1);
        oos.close();
        System.out.println("Serialized.\n");

        FileInputStream fis = new FileInputStream("prac_2_out.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.marks);

        System.out.println("\nDeserialized.");

    }

}

class Student implements Serializable{
    public final int rollno;
    public final String name;
    public final double marks;

    Student(){
        rollno = 2099;
        name = "John Doe";
        marks = 99.99;
    }
}
