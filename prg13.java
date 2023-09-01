//reverse number
import java.util.*;

class prg13{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int temp=num, rev=0;
		while(num>0){
			rev+=num%10;
			rev*=10;
			num/=10;
		}
		rev/=10;
		
		System.out.println("Reversed: " + rev);
	}
}x