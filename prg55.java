//try with multiple catch
import java.util.Scanner;
class prg55{
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			int res = a/b;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array was out of bounds lol");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception lol");
		}
		catch(Exception e) {
			System.out.println("Some exception idk");
		}
		finally {
			System.out.println("this always executes");
		}
		System.out.println("beans");
	}
}