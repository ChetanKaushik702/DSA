interface Expression {
	String display(String[] str) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
	EmptyArrayException() {
		super("Empty Array");
	}
}
public class Lambda3 {

	public static void main(String[] args) throws EmptyArrayException {
		
		String str[] = {"Concatenate this string."};
		
		Expression exp = string -> {
			if(args.length == 0)
				throw new EmptyArrayException();

				for(int i=0; i< args.length; i++)
					System.out.print(string[i] + " ");

			System.out.println("\n" + str[0]);
			return "This is going to return.";
		};

		System.out.println(exp.display(args));
		System.out.print("After concatenation string is:" + str[0].concat(exp.display(args)));
	}

}
