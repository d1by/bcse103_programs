import java.util.*;

//3x3 matrix subtraction
class prg28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Matrix 1: ");
		int arr1[][] = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+i+"]["+j+"]: ");
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix 2: ");
		int arr2[][] = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+i+"]["+j+"]: ");
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		int sub[][] = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sub[i][j] = arr1[i][j] - arr2[i][j]; 
			}
		}
		
		System.out.println("Subtraction: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
		}
	}
}