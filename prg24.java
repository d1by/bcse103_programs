	//24 - read 5 marks and find total and average and print "pass" if avg>=50
class javaProg{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Enter mark " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        int avg, total=0;
        for(int i=0; i<5; i++)
            total+=arr[i];
        
        avg=total/5;
        
        System.out.println("Total marks: " + total);
        if(avg>=50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
	}
}
