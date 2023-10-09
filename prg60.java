import java.io.*;

class CoolException extends Exception{
	public CoolException(String str) {
		System.out.println(str);
	}
}

class prg60{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Num :: ");
		
		int num = Integer.parseInt(br.readLine());
		
		try {
			if(num<0)
				throw new CoolException("Number is negative");
			else
				throw new CoolException("Number is non-negative");
		}
		
		catch(CoolException e) {
			System.out.println("nerd");
			e.printStackTrace();
		}
		
	}
}