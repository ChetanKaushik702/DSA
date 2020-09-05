import java.io.IOException;

// Demonstrate exec()
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try {
            p = r.exec("Notepad");
            p.waitFor();
        }   catch(IOException|InterruptedException e) {
            System.out.println("Error executing notepad: " + e);
        }
        System.out.println("Notepad returned: " + p.exitValue());
    }
}