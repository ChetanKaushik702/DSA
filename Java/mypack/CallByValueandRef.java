//Demonstrate call by value and call by reference
class Show{

	static int square(int x){
		return x*x;
	}

	 void change(int[] a){
		for(int i=0;i<a.length;i++)
			a[i] *= 2;
	}

}


class CallByValueandRef{
	public static void main(String[] args){
		int a = 15; //java uses call by value for primitive data types
		System.out.println("Value of a after invoking square(): " + Show.square(a) + "\nValue of stored in a: " + a);

		int[] b = {1, 2, 3, 4, 5};
		Show ob = new Show();
		ob.change(b);
		for(int x: b)
			System.out.print(x + " ");
	}
} 