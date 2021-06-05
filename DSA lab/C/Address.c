// This program prints the address of elements and their values
#include <stdio.h>
#include <conio.h>
#define R 4
#define C 4

void main() {
        //declaring matrix array
        int mat[R][C];
        printf("Enter %d elements in the %dX%d matrix: ", R*C, R, C);

        for (int i=0; i<R; i++)
            for (int j=0; j<C; j++)
                scanf("%d", &mat[i][j]);
        
        printf("Printing the values and addresses: ...");

        for (int i=0; i<R; i++) 
            for (int j=0; j<C; j++) 
                printf("\nAddress[%d][%d]: %u\tValue[%d][%d]: %-3d", i+1, j+1, &mat[i][j], i+1, j+1, mat[i][j]);
	
    getch();
}