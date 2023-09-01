//print even numbers from 1-100 backwards

class prg10{
	public static void main(String args[]){
		for(int i=100; i>0; i--){
			if(i==2)
				System.out.print(i + "\n");
			else if(i%2==0)
				System.out.print(i +", ");
		}
	}
}