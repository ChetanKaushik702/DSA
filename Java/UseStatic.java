//Demostrate static variables, methods and blocks.
class UseStatic{
	static int a = 3;
	static int b;

	static void meth(int x){
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	} 

	public static void main(String args[]){
		meth(42);

		/*for(int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "] : " + args[i]);*/
		for(String string : args)
			System.out.print(string + " ");
	} 
}