import java.util.Scanner;

public class LeadersInTheArray extends Leaders2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            
        //     for (int i=0; i<N; i++) {
        //         int flag = 1;
        //         for (int j=i+1; j<N; j++) {
        //             if (arr[i] < arr[j]) {
        //                 flag = 0;
        //                 break;
        //             }
        //         }
        //         if (flag == 1)
        //             System.out.print(arr[i] + " ");
        //     } 
        //     System.out.println();
        leaders(arr);
        }
        sc.close();
    }
}
