//47 - multilevel inheritance
class A{
	public A() {
		System.out.println("In class A!");
	}
	
	public void sayHi() {
		System.out.println("Hi from A!");
	}
}

class B extends A{
	public B() {
		System.out.println("In class B!");
	}
	
	public void sayHi() {
		System.out.println("Hi from B!");
		super.sayHi();
	}
}

class C extends B{
	public C() {
		System.out.println("In class C!");
	}
	
	public void sayHi() {
		System.out.println("Hi from C");
		super.sayHi();
	}
}

class prg47{
	public static void main(String args[]) {
		C obj = new C();
		obj.sayHi();
	}
}