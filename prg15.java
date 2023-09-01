//check if number is armstrong
import java.util.*;

class prg15{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int temp=num, sum=0;
		while(num>0){
			sum+=(num%10)*(num%10)*(num%10);
			num/=10;
		}
		
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}
}