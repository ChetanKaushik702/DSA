#include <stdio.h>
#define N 4

void spiral(int m, int n, int(*)[] a);
void spiral(int m, int n, int(*) a) {
    // int k=0, l=0;

    // while(k < m && l < n) {
    //     for (int i=l; i<n; i++) {
    //         printf("%d ", *((a+k)+i));
    //     }
    // }
    for (int i=0;i<m; i++) {
        for (int j=0; j<n; j++)
            printf("%d ", *((a+i)+j));
        puts("");
    }
}
void main() {
    int a[N][N];
    int val = 1;
    for (int i=0; i<N; i++) {
        for (int j=0; j<N; j++) {
            a[i][j] = val;
            // printf("%d ", a[i][j]);
            val++;
        }
        // puts("");
    }
    // printf("%d", val);
    // val--;
    // int i=0;
    // while(val) {
    //     printf("i: %d\n", i);
    //     for (int j=0; j<=N-i-1 && val != 0; j++) {
    //         if (i == 2 && j == 0) {
    //             val--;
    //             continue;
    //         }
    //         printf("%d ", a[i][j]);
    //         val--;
    //     }
        
    //     for (int j=i+1; j<=N-i-1 && val != 0; j++) {
    //         printf("%d ", a[j][N-i-1]);
    //         val--;
    //     }

    //     for (int j=N-2-i; j>=i && val != 0; j--) {
    //         printf("%d ", a[N-i-1][j]);
    //         val--;
    //     }

    //     for (int j=N-i-2; j>=i+2 && val != 0; j--) {
    //         printf("%d ", a[j][i]);
    //         val--;
    //     }
    //     printf("\n");
    //     i++;
    // }
    spiral(4, 4, a[0]);
}