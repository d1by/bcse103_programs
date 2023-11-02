// Demonstration of Serialisation

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Pgm72_73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Serialise Data.\n2. Deserialise Data.\nChoice?: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                Serialise ob = new Serialise();
                ob.exec();
                break;
            case 2:
                Deserialise ob1 = new Deserialise();
                ob1.exec();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}

class Student implements Serializable {
    public final String name;
    public final String address;
    public final int id;

    Student() {
        name = "asd";
        address = "dsad";
        id = 1;
    }
}

class Serialise implements Serializable {

    void exec() {
        Student s = new Student();

        try (FileOutputStream out = new FileOutputStream("stu.txt");
                ObjectOutputStream out1 = new ObjectOutputStream(out);) {
            out1.writeObject(s);
            System.out.println("Serialised and Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Deserialise implements Serializable {

    void exec() {
        try (FileInputStream out = new FileInputStream("stu.txt");
                ObjectInputStream out1 = new ObjectInputStream(out);) {
            Student s = (Student) out1.readObject();
            System.out.println(s.name);
            System.out.println(s.address);
            System.out.println(s.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
