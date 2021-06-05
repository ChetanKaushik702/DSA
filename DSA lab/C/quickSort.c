#include <stdio.h>
#define SIZE 10

int partition (int [], int, int);
void quickSort (int [], int, int);

int main () {
    static int a[SIZE];
    printf("Enter %d elements in the array:\n", SIZE);
    for (int i=0; i<SIZE; i++)
        scanf("%d", &a[i]);
    
    quickSort (a, 0, SIZE-1);

    printf("Sorted array: [%d", a[0]);
    for (int i=1; i<SIZE; i++)
        printf(", %d", a[i]);
    printf("]\n");

    return 0;
}

int partition (int a[], int p, int q) {
    int pivot = a[p];
    int i = p;
    int j = q;
    while (i <= j) {
        while (a[i] <= pivot)
            i++;
        while (a[j] > pivot)
            j--;
        if (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    a[p] = a[j];
    a[j] = pivot;

    return j;
}

void quickSort (int a[], int p, int q) {
    if (p < q) {
        int j = partition (a, p, q);
        quickSort (a, p, j-1);
        quickSort (a, j+1, q);
    }
}