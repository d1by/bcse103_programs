//44 - demo of simple inheritance
class A{
	int a,b;
	void display() {
		System.out.println("Values inside a: " + a + ", " + b);
	}
}

class B extends A{
	int c;
	void show() {
		System.out.println("Values insie b: " + a + ", " + b + ", " + c);
	}
}

class singleInheritance{
	public static void main(String args[]) {
		B obj = new B();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		obj.display();
		obj.show();
	}
}