//sum of digits of a number
import java.util.*;

class prg12{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if(num<0){
			num += -1 * 2*num;
		}
		
		int temp=num, sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}
		
		System.out.println("Sum: "+sum);
	}
}