// Bubble sort implementation
#include <stdio.h>
#define SIZE 5
#include <conio.h>

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void main() {
    int a[SIZE];
    printf("Enter %d elements in the array to sort them:\n", SIZE);
    
    for (int i=0; i<SIZE; i++)  scanf("%d", &a[i]);

    int flag = 0;
    //bubble sort in action
    for (int i=0; i<SIZE-1; i++) { // worst-case complexity: O(n^2)
        for (int j=0; j<SIZE-1-i; j++)
            if (a[j] > a[j+1]) {
                flag = 1;
                swap(&a[j], &a[j+1]);
            }
        if (!flag) {       // best case: O(n)
            printf("Array is already sorted.\n");
            break;
        }
    }
        

    printf("Sorted array: ");
    for (int i=0; i<SIZE; i++) 
        printf("%d ", a[i]);
    
    getch();
}