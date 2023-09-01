  //student details (regno, name, mark1, mark2, total, avg)
  import java.util.*;
  
  class Student{
    String regno, name;
    double mark1, mark2, total, avg;
    
    Student(String regno, String name, double mark1, double mark2){
      this.regno = regno;
      this.name = name;
      this.mark1 = mark1;
      this.mark2 = mark2;
    }
    
    void calc() {
      total = mark1 + mark2;
      avg = total/2;
    }
    
    void showDetails() {
      System.out.println("Name: " + name);
      System.out.println("Reg. No.: " + regno);
      System.out.println("Mark 1: " + mark1);
      System.out.println("Mark 2: " + mark2);
      System.out.println("Total: " + total);
      System.out.println("Average: " + avg);
    }
  }
  
  class prg36{
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter name: ");
      String name = sc.nextLine();
      System.out.println("Enter reg. no.: ");
      String regno = sc.nextLine();
      System.out.println("Enter mark 1: ");
      double mark1 = sc.nextDouble();
      System.out.println("Enter mark 2: ");
      double mark2 = sc.nextDouble();
      
      Student std = new Student(regno, name, mark1, mark2);
      std.calc();
      std.showDetails();
    }
  }
