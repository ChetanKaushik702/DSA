import java.io.*;
import java.util.*;
class CustomInput {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\DELL\\OneDrive\\Desktop\\Implementation\\input.txt");
        try {
            if (f.createNewFile()) {
                    FileWriter fw = new FileWriter(f);
                    String n = "1000000";
                    fw.write(n+"\n");
                    Random rand = new Random();
                    for (int i=1; i<=Integer.parseInt(n); i++) {
                        // if (i%5 == 0) {
                        //     fw.write(Integer.toString(-i)+" ");
                        // }else
                        // {
                        //     fw.write(Integer.toString(i)+" ");
                        // }
                        fw.write(rand.nextInt()+ " ");
                        // fw.write(5 + " ");
                    }
                    fw.close();
                }
        }catch(IOException e) {
            System.out.println("An error occured...");
            e.printStackTrace();
        }
    }
}
