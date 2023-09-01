//19 - fibonacci - 1,1,2,3,5,8...
class javaProgram {
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of elements: ");
	    int num = sc.nextInt();
	    int a=1;
	    int b=1;
	    int c;
	    for(int i=1; i<=num; i++){
	        if(i!=num)
	            System.out.print(a+", ");
            else
                System.out.print(a);
	        c=a+b;
	        a=b;
	        b=c;
	    }
	}
}
