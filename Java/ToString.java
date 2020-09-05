//Demonstration of toString() and equals() method
class ToString{
	String colour;

	ToString(String str){
		colour = str;
		//System.out.println("Color is: " + colour);
	}
	public static void main(String[] args){
		ToString ob1 = new ToString("Red");
		ToString ob2 = ob1;

		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println("Is ob1 equals ob2?");
		System.out.println(ob1.equals(ob2)); 
	}

	public String toString(){
		return ("Color of object is " + colour);
	}
}
