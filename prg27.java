import java.util.*;

//print 3x3 matrix 
class prg27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Enter element ["+i+"]["+j+"]");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}