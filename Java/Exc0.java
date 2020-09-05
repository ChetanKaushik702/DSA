// This is a program to display division by zero exception by default exception handler.
package mypack;

class Exc0{
	public static void main(String args[]){
		Exc1.Except();
		int a, b = 0;
		a = 12 / b;

		System.out.println("This will not be displayed.");
	}
} 

class Exc1{
	static int a, b;
	static void Except(){
		 b = 0;
		 a = 12 / b; 
	}
}
