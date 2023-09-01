//29 - matrix multiplication
import java.util.*;

class prg29{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		//input
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
		
		//matrix multiplcation
		int mul[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					mul[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		System.out.println("Multiplication: ");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}