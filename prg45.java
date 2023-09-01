//45 - method overriding
class Animal{
	void sound() {
		System.out.println("The animal is: ");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("cats can't talk.");
	}
}

class Override{
	public static void main(String args[]) {
		Cat obj = new Cat();
		obj.sound();
	}
}