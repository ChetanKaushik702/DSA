//Method overriding
class A{
	int i, j;
	A(int a, int b){
		i = a;
		j = b;
	}

	void show(){
		System.out.println("i and j : " + i + " " + j);
	}
}

class C extends A{
	int k;
	C(int a, int b, int c){
		super(a,b);
		k = c;
	}

	void show(){
		super.show();
		System.out.println("k : " + k);
	}
}

class B{
	public static void main(String args[]){
		C c = new C(1, 2, 3);

		c.show();
	}
}

