import java.util.*;
class prg53{
	public static void main(String args[]) {
		int a, b, ans;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter a: ");
			a = sc.nextInt();
			System.out.print("Enter b: ");
			b = sc.nextInt();
			
			ans = a/b;
			System.out.println(ans);
		}catch(Exception e) {
			System.out.println("Exception!");
			e.printStackTrace();
		}
		
		System.out.println("hi");
		
	}
}