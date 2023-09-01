//22 - read 5 numbers and display only the even numbers
class javaProgram{ 	
  public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int arr[] = new int[5];
	    for(int i=0; i<5; i++){
	        System.out.println("Enter element " + (i+1) + ": ");
	        arr[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<5; i++){
	        if(arr[i]%2==0){
                System.out.print(arr[i] + ", ");
	        }
	    }
	}
}
