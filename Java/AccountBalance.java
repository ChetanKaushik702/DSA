// A simple package
package mypack;

class Balance{
	String name; double bal;
	Balance(String n, double b){
		name = n; bal = b;
	}
	void show(){
	if(bal < 0)
		System.out.print("--> ");
	System.out.println(name + ":  $" + bal);
    }
}

class AccountBalance{
	public static void main(String[] args){
		Balance current[] = new Balance[3];
		current[0] = new Balance("Chetan Kaushik", 1000);
		current[1] = new Balance("Lalita Kaushik", 2000);
		current[2] = new Balance("triveni Devi", 3000);

		for(int i=0;i<3;i++) current[i].show();
	}
}