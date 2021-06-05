// Insertion sort algorithm 
#include <stdio.h>
#include <conio.h>
#define SIZE 10

void main() {
            int arr[SIZE];
            printf("Enter %d elements in the array: ", SIZE);
            for (int i=0; i<SIZE; i++) scanf("%d", &arr[i]);

            // insertion sort 
            for (int i=1; i<SIZE; i++) {
                int key = arr[i];
                int j = i-1;
                while (j >=0 && key < arr[j]) {
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
            }

            // displaying the sorted array
            printf("Sorted array: ");
            for (int i=0; i<SIZE; i++) 
                printf("%d ", arr[i]);

        getch(); 
}