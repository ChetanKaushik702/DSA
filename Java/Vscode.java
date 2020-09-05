import java.io.*;

class Vscode {
    static public void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello World!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        pw.println("Enter a character: ");
        char ch = (char)br.read();

        if(ch >= 'A' && ch <= 'Z')
            pw.println("\nUpper-case characteris an input by you.");
        if(ch >= 'a' && ch <= 'z')
            pw.println("Lower-case character is an input from your side.");
        else
            pw.println("Not an alphabet.");
    }
}