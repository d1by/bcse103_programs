// print numbers from 1-100 div by 6 and not div by 4
class prg11{
	public static void main(String args[]) {
		for(int i=1; i<=100; i++) {
			if(i%6==0 && i%4!=0)
				System.out.println(i + " ");
		}
	}
}