package multithreading;

// enum of marital status of a person
enum mar_Status {
	married, unmarried, divorced, widow, widower; 
}

class DemoEnum {
	public static void main(String[] args) {
		mar_Status p1 = mar_Status.married;
		System.out.println("p1 is " + p1);
		mar_Status array[] = mar_Status.values();

		System.out.print("Enumeration constants are: ");
		for(mar_Status a : array)	System.out.print(a + " ");

		p1 = mar_Status.valueOf("widower");
		System.out.println("Now, p1 becomes " + p1);
	}
}