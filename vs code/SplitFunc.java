import java.util.Scanner;

// Demonstration of split() function in class String.
class SplitFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String[] splits = s.split(",", 0);
        for (String string : splits) {
            System.out.println(string);
        }
        sc.close();
    }
}  