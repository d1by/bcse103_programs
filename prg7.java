//check if alphabet
import java.util.*;

class prg7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inp = sc.next().charAt(0);
		if(((inp>=65 && inp<=90) || (inp>=97 && inp<=122)))
			System.out.println("Character. ");
		else
			System.out.println("Not a character. ");
	}
}
