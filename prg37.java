// 37 - private access modifier

class A{
	private int data = 40;
	private void msg() {
		System.out.println("Hello java");
		
	}
}

class prg37{
	public static void main(String args[]) {
		A obj = new A();
		System.out.println(obj.data);
	}
}