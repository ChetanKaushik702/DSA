//Interfaces achieve one of the most important concept of "SINGLE INTERFCE, MULTIPLE METHODS"
class Polymorphism{
	public static void main(String args[]){

		IntStack ins; //declares a variable of interface InStack
		DynamicStack ob1 = new DynamicStack(5); // Declares an object of type DynamicStatic
		FixedStorage  ob2 = new FixedStorage(8);  // Declares an object of type FixedStorage

		ins = ob2; //gives reference of object ob2 to the interface variable

		for(int i=0;i<8;i++) ob2.push(i); //pushes an item into the stack of fixed storage

		//popping out an item from the fixed size stack
		for(int i=0;i<8;i++)
			System.out.println("FixedStack ITEM[" + i + "] : " + ob2.pop());

		ins = ob1; //gives reference of object ob1 to the interface variable

		for(int i=0;i<12;i++) ob1.push(i); // pushes an item into the stack of dynamic storage

		for(int i=0;i<12;i++)
			System.out.println("DynamicStack ITEM[" + i + "] : " + ob1.pop());

	}
} 