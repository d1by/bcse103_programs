//check if prime
import java.util.Scanner;

class prg16{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		boolean prime = true;
		for(int i=2; i<(num/2)+1; i++) {
			if(num%i==0) {
				prime = false;
				break;
			}
		}
		if(prime)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
}
		