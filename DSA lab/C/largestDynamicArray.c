#include <stdlib.h>
#include <stdio.h>
#include <limits.h>

int main() {

    int n;
    printf("Enter the size of the array: ");
    scanf("%d", &n);

    int *ptr = (int *)calloc(n, sizeof(int));

    if (ptr == NULL) {
        printf("Memory not allocated.\n");
        exit(0);
    }
    else {
        printf("Memory succesfully allocated.\n");
        printf("Enter %d elements in the array:\n", n);
        int max = INT_MIN;
        for (int i=0; i<n; i++) {
            scanf("%d", &ptr[i]);
            if (max < ptr[i])
                max = ptr[i];
        }

        printf("Array is: ");
        for (int i=0; i<n; i++)
            printf("%d ", ptr[i]);
        
        printf("\nLargest element in the array is: %d\n", max);

        free(ptr); // memory de-allocated during runtime by using free() function which is a part of stdlib library
        printf("Memory de-allocated successfully.\n");
    }
}