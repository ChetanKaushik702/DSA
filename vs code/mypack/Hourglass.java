public class Hourglass {
    public static void main(String[] args) {
    int[][] a = {   {1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 0, 0, 0},
                    {0, 0, 2, 4, 4, 0},
                    {0, 0, 0, 2, 0, 0},
                    {0, 0, 1, 2, 4, 0}
                };

        int sum = 0, max_sum = -100;
        for (int i=0; i<4; i++) {
            int t = 4, p=0;
            while(t-- > 0) {
                sum = a[i][p] + a[i][p+1] + a[i][p+2] + a[i+1][p+1]
                      + a[i+2][p] + a[i+2][p+1] + a[i+2][p+2];
                p++;
                System.out.println("sum[" + p + "]: " + sum);
                if (max_sum < sum) {
                    max_sum = sum;
                    System.out.println("max_sum: " + max_sum);
                }
            }
            
        }
    }
}