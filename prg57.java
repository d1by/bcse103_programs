import java.util.*;

class prg57{
	public static int divideNum(int m, int n) throws ArithmeticException{
		int div = m/n;
		return div;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter m: ");
		int m = sc.nextInt();
		System.out.print("Enter n: ");
		int n = sc.nextInt();

		prg57 obj = new prg57();
		try {
			obj.divideNum(m, n);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception lol");
		}
		finally {
			System.out.println("This always executes lol");
		}
		
	}
}