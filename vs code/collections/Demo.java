//package collections;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j] = sc.nextInt();

        int sum=-64, sum2=0;
        /*
        for(int i=0;i<n-2;i++) {
            for(int t=i;t<=i+2;t++)
                for(int j=0;j<=2;j++)
                    sum2 += a[t][j];
                sum2 -= (a[i+1][0] + a[i+1][2]);
                sum = Math.max(sum, sum2);
                System.out.println("(" + (i+1) + ", " + 0 + ")" + ": " + sum + "\n");
                sum2 = 0;
            for(int t=i;t<=i+2;t++)
                for(int j=1;j<=3;j++)
                    sum2 += a[t][j];
                sum2 -= (a[i+1][1] + a[i+1][3]);
            System.out.println("(" + (i+1) + ", " + 1 + ")" + ": " + sum2);
                sum = Math.max(sum, sum2);
                System.out.println("(" + (i+1) + ", " + 1 + ")" + ": " + sum +"\n");
                sum2 = 0;
            
            for(int t=i;t<=i+2;t++)
                for(int j=2;j<=4;j++)
                    sum2 += a[t][j];
                sum2 -= (a[i+1][2] + a[i+1][4]);
                System.out.println("(" + (i+1) + ", " + 2 + ")" + ": " + sum2);
                sum = Math.max(sum, sum2);
                System.out.println("(" + (i+1) + ", " + 2 + ")" + ": " + sum+"\n");
                sum2 = 0;

            for(int t=i;t<=i+2;t++)
                for(int j=3;j<=5;j++)
                    sum2 += a[t][j];
                sum2 -= (a[i+1][3] + a[i+1][5]);
                System.out.println("(" + (i+1) + ", " + 3 + ")" + ": " + sum2);
                sum = Math.max(sum, sum2);
                System.out.println("(" + (i+1) + ", " + 3 + ")" + ": " + sum+"\n");
                sum2 = 0;
                System.out.println("\n\n");
        } */
        for(int u=0;u<6;u++) {
            for(int v=0;v<6;v++) 
                if(u<=3 && v<=3)
                    sum2 = a[u][v] + a[u][v+1] + a[u][v+2] + a[u+1][v+1] +a[u+2][v] + a[u+2][v+1] + a[u+2][v+2];
            sum = Math.max(sum, sum2);
        }
        sc.close();
        System.out.println("Maximum sum is: " + sum);
    }
}