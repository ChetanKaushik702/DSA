#include <stdio.h>
#include <conio.h>
#define R 3
#define C 4

void main() {
    static int a[R][C];
    int size=8;
    printf("Enter %d elements in the 2D array:\n", size);
    int *p = a;
    for (int i=0; i<size;i++) {
        scanf("%d", p+i);
    } 
    printf("Before insertion array is:\n");
    int r;
    if (size%C == 0)    r = size/C;
    else    r = size/C + 1;

    for (int i=0; i<r; i++) {
        for (int j=0; j<C; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }

    int pos, ele;
    printf("Enter the position and element: ");
    scanf("%d %d", &pos, &ele);
    for (int i=size; i>=pos; i--) {
        *(p+i+1) = *(p+i);
    }
    *(p+pos) = ele;
    size++;
    if (size%C == 0)    r = size/C;
    else    r = size/C + 1;

    printf("After insertion of %d at position %d in the 2D array, array is:\n", ele, pos);
    for (int i=0; i<r; i++) {
        for (int j=0; j<C; j++)
            printf("%d ", a[i][j]);
        printf("\n");
    }
    getch();
}