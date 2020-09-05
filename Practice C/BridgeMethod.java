class Gen<T> {
	T ob; // creating a reference variable of type T

	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}
}

class Gen2 extends Gen<String> {
	
	Gen2 (String o) {
		super(o);
	}

	String getOb() {
		System.out.println("You called String getOb().");
		return ob;
	}
}

public class BridgeMethod {

	public static void main(String[] args) {

		var strOb2 = new Gen2("Generics Test.");

		if(strOb2 instanceof Gen)
			System.out.println("strOb2 is an object of type Gen.");
		System.out.println(strOb2.getOb());
	}
}