import java.util.Scanner;

interface DemoInterface {
    boolean absmethod(int x);
}

public class LambdaFundamentals {
    
    public String toString() {
        return "LambdaFundamentals instance.";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DemoInterface demo;
        demo = x -> (x % 2 == 0);
        System.out.print("Enter a number: ");
        if(demo.absmethod(sc.nextInt()))
            System.out.println("You entered an even number.");
        else
            System.out.println("You entered an odd number.");

        /*demo.a = 2; demo.b = 3; demo.c = 4;
        System.out.println("Volume of cuboid with dimensions " + demo.a + ", " + demo.b + ", " + demo.c + " is " + demo.volume());*/
        sc.close();
        if(demo instanceof Demo)
            System.out.println("demo is an instance of Demo.");
        else
            System.out.println("demo is not an instance of Demo.");
        
        System.out.println(demo);
        var ob = new LambdaFundamentals();
        System.out.println(ob);

        
    }
}

class Demo implements DemoInterface {
    double a, b, c;

    Demo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double volume() {
        return a * b * c;
    }
    public boolean absmethod(int x) {
        int flag = 0;
        for(int i=2; i<Math.sqrt(x); i++)
            if(x % i == 0) {flag = 1; break;}
        if(flag == 0) return true;
        else return false;
    }

}