public class VarargsAmbiguity {
    static int vaTest(int ... v) {
        int prod = 1;
        for (int x:v) prod *= x;
        return prod; 
    }

    static int vaTest(int v) {
        return 2*v;
    }
    public static void main(String[] args) {
        System.out.println(vaTest(2, 3));
        System.out.println(vaTest(2));
        System.out.println(vaTest(3));
    }
}
