//package collections;

import java.util.Scanner;

interface Reverse {
    void revStr(String s);
}
class StringReverse {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.print("Input a String: ");
        String input = sc.nextLine();
        Reverse str = (s)-> {
            for(int i=s.length()-1;i>=0;i--)
                System.out.print(s.charAt(i));
            };
            str.revStr(input);
            StringBuffer strBuf = new StringBuffer(input);
            StringBuffer revString = strBuf.reverse();
            System.out.println("\n" + revString); 
            System.out.println("Is strBuf == revString?\n" + (strBuf == revString));
        }
    }
}