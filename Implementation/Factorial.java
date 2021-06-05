public class Factorial {
    final static private int MAX = 4000;

    static void factorial(int n) {
        int arr[] = new int[MAX];
        arr[0] = 1;
        int size = 1;

        for (int x=2; x<=n; x++)
            size = multiply(arr, x, size);

        for (int i=size-1; i>=0; i--)
            System.out.print(arr[i]);
        System.out.println("\nSize: " + size + "\n");
    }

    static int multiply(int arr[], int x, int size) {
        int carry = 0;

        for (int i=0; i<size; i++) {
            int prod = arr[i] * x + carry;
            arr[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            arr[size] = carry % 10;
            carry /= 10;
            size++;
        }

        return size;
    }

    public static void main(String[] args) {
        factorial(5);
        factorial(1);
        factorial(0);
        factorial(8);
        factorial(100);
        factorial(50);
        factorial(200);
        factorial(300);
        long beg = System.currentTimeMillis();
        factorial(1000);
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end-beg) + "ms.");
    }
}
