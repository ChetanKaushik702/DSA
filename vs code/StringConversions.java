// Convert an integer into binary, hexadecimal, and octal.

public class StringConversions {
    public static void main(String[] args) {
        Integer num = 10;
        System.out.println(num + " in binary: " + Integer.toBinaryString(num));
        System.out.println(num + " in octal: " + Integer.toOctalString(num));
        System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
    }    
}