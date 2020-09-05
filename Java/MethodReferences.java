interface Stringfunc {
	String func(String str);
} 

class MethodOps {
	 String reverse(String str) {
		String result = "";
		for(int i=str.length()-1; i>=0; i--) 
			result += str.charAt(i);

		return result;
	}
}

class MethodReferences {
	String strOp(Stringfunc x, String input) {
		return x.func(input);
	}

	static public void main(String[] args) {
		String inStr = "Lambdas add special power to Java", outStr;
		var ob = new MethodReferences();
		outStr = ob.strOp(new MethodOps() :: reverse, inStr);

		System.out.println("String before reversal: " + inStr);
		System.out.println("String after reversal: " + outStr);
	}
}