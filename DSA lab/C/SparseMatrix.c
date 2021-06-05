//Sparse matrix program
#include <stdio.h>

int main() {

			//declaring non-negative variable
			int nonNeg = 0;

			//declaring matrix
			int M[5][3];

			//declaring rows and columns of matrix
			int rows=3, cols=3;

			//taking matrix input
			printf("Enter matrix\n");
			for (int i=0; i<rows; i++)
				for (int j=0; j<cols; j++) {
					scanf("%d", &M[i][j]);

					if(M[i][j] != 0)
						nonNeg++; 
				}

			//declaring sparse matrix required variables
			int sparse[3][3], rs = 1;

			//initializing its initial entries
			sparse[0][0] = rows;
			sparse[0][1] = cols;
			sparse[0][2] = nonNeg;

			for (int i=0; i<rows; i++)
				for (int j=0; j<cols; j++) {

					if (M[i][j] != 0) {
						sparse[rs][0] = i;
						sparse[rs][1] = j;
						sparse[rs][2] = M[i][j];
						rs++;
					}
				}

			//output sparse matrix
			printf("Sparse matrix\n");
			for (int i=0; i<rs; i++) {
				for (int j=0; j<3; j++)
					printf("%d ", sparse[i][j]);

				printf("\n");
			}

	return 0;
}
