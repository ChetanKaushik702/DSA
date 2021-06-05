// Basic matrix program
#include <stdio.h>

int main() {

	//declaring matrices
	int M1[3][3], M2[3][3];

	int inputIndicator = 0;

	//defining variable for choice
	int choice;
	do {
				//defining menu
				printf("Enter 1 to input matrices\n");
				printf("Enter 2 to display matrices\n");
				printf("Enter 3 to add the entered matrices\n");
				printf("Enter 4 to subtract the entered matrices\n");
				printf("Enter 5 to multiply the entered matrices\n");
				printf("Enter 0 to exit\n");
		
				//taking user choice
				scanf("%d", &choice);

				switch (choice) {

					case 1:
						//input matrix 1
						printf("Enter matrix 1 elements\n");
						for (int i=0; i<3; i++)
							for(int j=0; j<3; j++)
								scanf("%d", &M1[i][j]);

						//input matrix 2
						printf("Enter matrix 2 elements\n");
						for (int i=0; i<3; i++)
							for(int j=0; j<3; j++)
								scanf("%d", &M2[i][j]);

						inputIndicator = 1;

					break;

					case 2: 

						//case when the user wants to display the matrices without entering the 
						//elements
						  if (!inputIndicator)
						  	printf("ERROR!! Input the matrices first.\n");
						  else {

								//displaying matrix 1
								printf("Matrix 1\n");
								for (int i=0; i<3; i++) {
									for(int j=0; j<3; j++)
										printf("%d ", M1[i][j]);

									printf("\n");
								}

								//displaying matrix 2
								printf("Matrix 2\n");
								for (int i=0; i<3; i++) {
									for(int j=0; j<3; j++)
										printf("%d ", M2[i][j]);

									printf("\n");
								}
							}
					break;

					case 3:

						//case when the user tries to add the matrices 
						//without entering the elements of matrices
						  if (!inputIndicator) 
						  	printf("ERROR!! Input the matrices first.\n");
						  else {

						  		//declaring add matrix
								int add[3][3];
						  		//displaying the addition matrix
						  		printf("Addition matrix\n");
						  		for (int i=0; i<3; i++) {
						  			for (int j=0; j<3; j++){
						  				add[i][j] = M1[i][j] + M2[i][j];
						  				printf("%d ", add[i][j]);
						  			}

						  			printf("\n");
						  		}
						  }
					break;

					case 4:

						//case when the user tries to subtract the matrices 
						//without entering the elements of matrices
						  if (!inputIndicator) 
						  	printf("ERROR!! Input the matrices first.\n");
						  else {

						  		//declaring a subtract matrix
						  		int sub[3][3];
						  		//displaying the addition matrix
						  		printf("Subtraction matrix\n");
						  		for (int i=0; i<3; i++) {
						  			for (int j=0; j<3; j++) {
						  				sub[i][j] = M1[i][j] - M2[i][j];
						  				printf("%d ", sub[i][j]);
						  			}

						  			printf("\n");
						  		}
						  }
					break;

					case 5:

						//case when the user tries to multiply the matrices
						//without entering the elements of matrices
						  if (!inputIndicator) 
						  	printf("ERROR!! Input the matrices first.\n");
						  else {

						  		//declaring the multiply matrix
						  		int Multiply[3][3];

						  		//initializing the elements of matrix Multiply as 0
						  		for (int i=0; i<3; i++)
						  			for (int j=0; j<3; j++)
						  				Multiply[i][j] = 0;

						  		//displaying the addition matrix
						  		printf("Multiplication matrix\n");
						  		for (int i=0; i<3; i++) {
						  			for (int j=0; j<3; j++) {
						  				for (int k=0; k<3; k++)
						  					Multiply[i][j] += M1[i][k] * M2[k][j];

						  				printf("%d ", Multiply[i][j]);
						  			}

						  			printf("\n");
						  		}
						  }
					break;	

					case 0:

						printf("Exiting from the do-while loop.");

					break;

					default:
							printf("ERROR!! Please enter a valid choice.\n");		
				}

		printf("\n");

	} while (choice != 0);

	return 0;
}