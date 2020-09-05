//Enhanced for-each loop(data is read only in a for-each loop)
class ForEach{
	public static void main(String[] args){
		char alphabet[] = {'a','e','i','o','u'};
		// for-each loop
		for(char ch: alphabet){
			System.out.print(ch + " ");// Displays the same alphabets which means the data is read only
			ch -= 32;
	}
	System.out.println();

	for(char ch: alphabet)System.out.print(ch + " ");

		System.out.println();

		int num[] = {1,2,3,4,5,6,7,8,9,10};
	for(int x: num){
	//	x *= 10;
		System.out.print(x + " ");
		x *= 10;
	}

	}
}