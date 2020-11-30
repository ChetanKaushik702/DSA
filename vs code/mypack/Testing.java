
public class Testing {
    public static void main(String[] args) {
        int flag = 0, i = 2;
        while(flag == 0) {
            int t1 = 4*i + 3;
            double t2 = 18 * Math.log(i) / Math.log(2);
            System.out.println("t1: " + t1 + "\t t2: " + t2);
            if (t2 <= t1)
                flag = 1;
            i++;
        }
    }
}
