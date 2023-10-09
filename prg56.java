import java.util.*;

class prg56{
	public static void checkNum(int num) {
		if(num<1)
			throw new ArithmeticException("Number is negative");
		else
			System.out.println(num*num);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int n = sc.nextInt();
		prg56 obj = new prg56();
		obj.checkNum(n);
	}
}