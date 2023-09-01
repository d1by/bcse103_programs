//20 - biggest among two numbers using condtional operator
class javaProgram{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    int a = sc.nextInt();
	    System.out.println("Enter second number: ");
	    int b = sc.nextInt();
	    
	    int c = a>b?a:b;
	    System.out.println("Biggest number: " + c);
     }
}
