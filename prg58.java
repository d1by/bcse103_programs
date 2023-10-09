import java.util.*;

class prg58{
	public static void eligible(int age) {
		if(age<18)
			throw new ArithmeticException("Younger than 18 years old");
		else
			System.out.println("Eligible to vote");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		prg58 obj = new prg58();
		obj.eligible(age);
	}
}