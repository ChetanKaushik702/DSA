class StaticDemo{
	static int a = 42;
	static int b = 99;

	static void callme(){
		System.out.println("a = " + a);
	}
}

class StaticByName{
	public static void main(String args[]){
		//Calling a static method inside a static method of another class by making an object of that class
		StaticDemo ob = new StaticDemo();
		ob.callme();
		System.out.println("b = " + ob.b);
		StaticDemo.callme();
		System.out.println("b = " + StaticDemo.b);

	}
}