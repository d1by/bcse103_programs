import java.io.*;

class br{
	// public static void main(String args[]) throws IOException {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter num: ");
		try {
			int n = Integer.parseInt(br.readLine());
			System.out.println(n);
		}
		catch(IOException e){
			System.out.println("errrrrrrrrrrrorrrrrrrrrrrr");
		}
	}
}