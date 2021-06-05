public class MethodOverloading {
    
    void test() {
        System.out.println("Inside test()");
    } 

    double test(double i) {
        System.out.println("Inside test(double i): " + i);
        return i;
    } 

    int test(int a, int b) {
        System.out.println("Inside test(int a, int b): " + (a+b));
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.test();
        obj.test(88);
        obj.test(1, 2);
    }
}
