//voter age eligibility 
import java.util.*;

class prg5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>18)
			System.out.println("Age: " + age + " - Eligible");
		else
			System.out.println("Age:  " + age + "Not eligible. ");
	}
}
