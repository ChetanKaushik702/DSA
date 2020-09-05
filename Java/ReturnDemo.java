//Demonstration of return statements in java
class ReturnDemo{
	static public void main(String[ ] args){
		int  t = 1;
		System.out.println("This will be displayed.");

		if(t != 0) return;
		System.out.println("This won't be displayed.");
	}
}