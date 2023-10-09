import java.util.*;

class prg54{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[4];
		
		for(int i=0; i<4; i++) {
			System.out.print("Enter player " +  (i+1) + ": "); 
			arr[i] = sc.nextLine();
		}
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			System.out.println("Exception!");
			e.printStackTrace();
		}
		
		System.out.println("Bye");
	}
}