// Primitive types are passed by value and Objects are passed through their references.
class Test{
	int a, b;

	Test(int i, int j){
		a = i;
		b = j;
	}

	//pass a primitive type
	void test(int i, int j){
		i *= 2; 
		j /= 2;
	} 

	// pass an object
	void meth(Test o){
		o.a *= 2;
		o.b /= 2;
	}
}

class ArgumentPassing{
	public static void main(String[] args){
		Test ob = new Test(15, 20);

		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

		ob.test(15, 20);// call by value

		System.out.println("ob.a and ob.b after call to test(): " + ob.a + " " + ob.b);

		ob.meth(ob);// call by reference

		System.out.println("ob.a and ob.b after call to meth(): " + ob.a + " " + ob.b);
	}
}