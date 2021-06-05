import java.util.*;
class Codechef {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int a[] = new int[n];
                int b[] = new int[m];
                int sum_a=0, sum_b=0;
                for (int i=0; i<n; i++) {a[i] = sc.nextInt(); sum_a += a[i];}
                for (int i=0; i<m; i++) {b[i] = sc.nextInt(); sum_b += b[i];}

                //best case when sum_a > sum_b
                if (sum_a > sum_b)  System.out.println(0);
                else {
                    Arrays.sort(a);
                    Arrays.sort(b);
                    
                    //case when n >= m
                    if (n >= m) {
                        int j=0, flag=0;
                        for (int i=m-1; i>=0; i--) {
                            if(a[j] < b[i]) {
                                int temp = a[j];
                                a[j] = b[i];
                                b[i] = temp;
                                sum_b += (b[i]-a[j]);
                                sum_a += (a[j]-b[i]);
                                if (sum_a > sum_b) {
                                    flag = 1;
                                    break;
                                }
                                j+=1;
                            }else {
                                break;
                            }
                        }
                        if (flag == 1)  System.out.println(j+1);
                        else    System.out.println(-1);
                    }else {
                        int j=m-1, i, flag=0;
                        for (i=0; i<n; i++) {
                            if (a[i] < b[j]) {
                                int temp = a[i];
                                a[i] = b[j];
                                b[j] = temp;
                                sum_b += (b[j]-a[i]);
                                sum_a += (a[i]-b[j]);
                                if (sum_a > sum_b) {
                                    flag = 1;
                                    break;
                                }
                                j-=1;
                            }else {
                                break;
                            }
                        }
                        if (flag == 1) System.out.println(i+1);
                        else System.out.println(-1);
                    }
                }
            }
        }
    }
}