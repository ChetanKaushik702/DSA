import java.util.Scanner;

//Demonstrate a method reference to an instance method

//A functional interface for string operations.
interface Stringfunc {
    String func(String n);
}

// Now, this class defines an interface method called strReverse().
class MyStringOps {
    String strReverse(String str) {
        String result = "";
        int i=str.length() - 1;

        while(i >= 0) {
            result += str.charAt(i);
            i--;
        }

        return result;
    }
}

class MethodRefDemo2 {
    
    // This method has functinal interface as the type of its first parameter. Thus, 
    // it can be passed any instance of that interface, including method references.

    static String stringOp(Stringfunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       MyStringOps ob = new MyStringOps();
        System.out.print("Input a string: ");
        String inStr = sc.nextLine(), outStr;
        outStr = stringOp(ob :: strReverse, inStr);

        System.out.println("Input string: " + inStr);
        System.out.println("Reversed string: " + outStr);

        sc.close();
    }
}