//21 - smallest among three numbers
class javaProgram{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter first number: ");
	    int a = sc.nextInt();
	    System.out.println("Enter second number: ");
	    int b = sc.nextInt();
	    System.out.println("Enter third number: ");
	    int c = sc.nextInt();
	    
	    int d = a<b?(a<c?a:c):(b<c?b:c);
	    System.out.println("Smallest number: " + d);
	}
}
