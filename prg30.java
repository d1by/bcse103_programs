// read string and count number of characters
import java.util.*;

class prg30{
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		String inpStr = sc.nextLine();
		
		int count=0;
		char chArr[] = inpStr.toCharArray();
		
		//for each loop
		for(char c : chArr) {
			count++;
		}
		
		System.out.println("Count: " + count);
	}
}