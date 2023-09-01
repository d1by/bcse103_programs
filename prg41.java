//41 - final keyword

final class finalClass{
	void finalMethod() {
		System.out.println("hello");
	}
}

class finalClassTest extends finalClass{
	public static void main(String args[]) {
		finalClass obj = new finalClass();
		obj.finalMethod();
	}
}