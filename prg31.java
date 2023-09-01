//31 - find the number of uppercase, lowercase, digits, and special case letters in string
import java.util.*;

class prg31{
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String inpStr = sc.nextLine();
		
		int up=0, low=0, dig=0, spec=0;
		for(int i=0; i<inpStr.length(); i++) {
			char c = inpStr.charAt(i);
			if(c >= 65 && c <=90)
				up++;
			else if(c>=97 && c<=122)
				low++;
			else if(c>=48 && c<=57)
				dig++;
			else
				spec++;
		}
		
		System.out.println("Uppercase: " + up);
		System.out.println("Lowercase: " + low);
		System.out.println("Digits: " + dig);
		System.out.println("Special: " + spec);
	}
}