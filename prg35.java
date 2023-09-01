//35
import java.util.*;

class Employee{
  String name;
  int age;
  double salary;
  
  Employee(String name, int age, double salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  
  void incentive() {
    double inc = 0.1 * this.salary;
    System.out.print("Incentive: " + inc);
  }
  
  void details() {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Salary: " + this.salary);
  }
}

class prg35{
  public static void main(String args[]) {
    Employee e1 = new Employee("diby", 19, 999999.99);
    e1.details();
    e1.incentive();
    System.out.println("\n");
    Employee e2 = new Employee("not diby", 20, 99.99);
    e2.details();
    e2.incentive();
  }
}
