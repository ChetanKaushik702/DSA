#include <stdio.h>
#include <conio.h>
#define M 5
#define N 6

void disp(int a[], int n) {
    printf("[%d, ", a[0]);
    for (int i=1; i<n-1; i++)
        printf("%d, ", a[i]);
    printf("%d]\n", a[n-1]);
}

void main() {
    int a[M];
    int b[N];

    printf("Enter %d elements in array1(in sorted manner): ", M);
    for  (int i=0; i<M; i++)
        scanf("%d", &a[i]);

    printf("Enter %d elements in array2(in sorted manner): ", N);
    for  (int i=0; i<N; i++)
        scanf("%d", &b[i]);

    int ans[M+N];
    int i=0,j=0,k=0;
    while (i < M && j < N) {
        if (a[i] <= b[j]) {
            ans[k] = a[i];
            i++;
        }else {
            ans[k] = b[j];
            j++;
        }
        k++;
    }

    if (i >= M) {
        for (int t=j; t<N; t++)
            ans[k++] = b[t];
    }
    if (j >= N) {
        for (int t=i; t<M; t++)
            ans[k++] = a[t];
    }

    printf("Array1:\n");
    disp(a, M);

    printf("Array2:\n");
    disp(b, N);

    printf("Resultant Array:\n");
    disp(ans, M+N);

    getch();
}