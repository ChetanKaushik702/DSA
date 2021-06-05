// Selection sort implementation in C
#include <stdio.h>
#include <conio.h>
#define SIZE 3

void swap (int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

int main() {
    int a[SIZE];
    printf("Enter %d elements in the array to sort them:\n", SIZE);
    
    for (int i=0; i<SIZE; i++) scanf("%d", &a[i]);

    // selection sort in action
    for (int i=0; i<SIZE-1; i++) {
        for (int j=i+1; j<SIZE; j++) { 
            if (a[i] > a[j]) 
                swap(&a[i], &a[j]);
        }
    }
    
    //displaying the sorted array
    printf("Sorted array: ");
    for (int i=0; i<SIZE; i++)
        printf("%d ", a[i]);
    
    return 0;
}