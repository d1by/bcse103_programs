//check if palindrome
import java.util.*;

class prg32{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String inp = sc.nextLine();
		
		String out = "";
		for(int i=inp.length()-1; i>=0; i--) {
			out += inp.charAt(i);
		}
		
		System.out.println("Input string: " + inp + "\nReversed String: " + out);
		if(inp.toLowerCase().equals(out.toLowerCase()))
			System.out.println("Palindrome.");
		else
			System.out.println("Not a palindrome");
	}
}