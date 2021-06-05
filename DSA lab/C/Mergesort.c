// Merge sort implementation
# include <stdio.h>
# define SIZE 7
void mergeSort (int [], int, int);
void merge (int [], int, int, int);

void mergeSort (int a[], int beg, int end) {
    if (beg < end) {
        int mid = (beg + end) / 2;
        mergeSort (a, beg, mid);
        mergeSort (a, mid+1, end);
        merge (a, beg, mid, end);
    }
}

void merge (int a[], int beg, int mid, int end) {
    int b[mid-beg+1];
    int c[end-mid];
    for (int i=0; i<=mid; i++)
        b[i] = a[beg+i];
    for (int i=0; i<end-mid; i++)
        c[i] = a[mid+i+1];
    
    int i=beg,j=mid+1,k=beg;
    while (i <= mid && j <= end) {
        if (b[i] <= c[j]) {
            a[k] = b[i];
            i++;
        }else {
            a[k] = c[j];
            j++;
        }
        k++;
    }
    if (i > mid) {
        for (int t=j; t<=end; t++) 
            a[k++] = c[j];
    }
    if (j > end) {
        for (int t=i; t<=mid; t++)
            a[k++] = b[t];
    }
}

void main () {
    int a[SIZE];
    printf("Enter %d elements in the array: ", SIZE);
    for (int i=0; i<SIZE; i++) {
        scanf ("%d", &a[i]);
    }
    printf("Given array: ");
    for (int i=0; i<SIZE; i++) {
        printf("%d ", a[i]);
    }
    mergeSort(a, 0, SIZE-1);

    printf("\nSorted array: ");
    for (int i=0; i<SIZE; i++) {
        printf("%d ", a[i]);
    }
}


