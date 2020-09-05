//Inheritence program
class Inherit{
	static String name;
	static int age;
	static String situation;

	Inherit(String n, int age, String sit){
		name = n;
		this.age = age;
		situation = sit; 
	}

	static void display_info(){
		System.out.println(name + " age " + age + "years old and adapting in the crisis of " + situation +".");
	}
}

class StaticInherit extends Inherit{
	StaticInherit(String n, int age, String sit){
		super(n,age,sit);
	}

	public static void main(String[] args){
		StaticInherit ob = new StaticInherit("Chetan Kaushik", 18, "COVID-19");

		Inherit.display_info();
	}
}