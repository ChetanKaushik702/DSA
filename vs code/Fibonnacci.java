import java.io.*;

class Fibonacci {
    static int fib(int n) {
        if(n == 0 || n == 1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the number of terms for Fibonacci series: ");
        int num = Integer.parseInt(br.readLine());

        System.out.print("Fibonacci series consisting of " + num + " terms is: ");

        for(int i=0; i<num; i++)
            System.out.print(fib(i) + " ");
    }
}