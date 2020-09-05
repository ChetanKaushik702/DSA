// Timing program execution

public class Elapsed {
    public static void main(String[] args) {
        long start, end=0;

        System.out.println("Timing a for loop for 0 to 100,000,000");

        // time a for loop from 0 to 100,000,000
        start = System.currentTimeMillis();
        for(int i=0;i<100000000;i++)
        end = System.currentTimeMillis();

        System.out.println("Elapsed time: " + (end-start));
    }    
}