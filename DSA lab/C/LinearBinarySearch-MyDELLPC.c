// Linear search and binary search algorithms implementation
#include <stdio.h>
#include <conio.h>
#define SIZE 10
void main() {

		//defining an array
		int arr[SIZE], choice;

		printf ("Enter %d elements in the array(in sorted manner): ", SIZE);

		for (int i=0; i<SIZE; i++)
			scanf("%d", &arr[i]);

		//declaring an element to take input from user to search it in the array
		int element, flag = 0, i;
		printf ("Enter an element to know whether it is present in the array or not: ");
		scanf("%d", &element);

		do {
			printf ("Enter 1 for Linear search.\n");
			printf("Enter 2 for Binary search.\n");
			printf("Enter 0 to exit.\n");

			scanf("%d", &choice);

			switch(choice) {

				case 0:
				printf ("Exiting...\n");
				break;
				case 1:
				//Linear search implementation to know only if the element is present in the array or not
				for (i=0; i<SIZE; i++) 
					if (arr[i] == element) {
						flag = 1;
						break;
				}

				if (flag)
					printf("%d is present in the array at position %d.\n", element, i+1);
				else
					printf("%d is not present in the array.\n", element);

				break;

				
				case 2: {
				//Binary search iterative implementation
				int beg=0, end=SIZE-1, mid;
				flag = 0;
				while (beg <= end) {
					 mid = (beg + end) / 2;
					if (arr[mid] == element) {
						flag = 1;
						break;
					}
					else if (arr[mid] > element) 
							end = mid-1;
						 else
					 		beg = mid+1;
				}

				if (flag) 
					printf("%d is present in the array at %d position.\n", element, mid+1);
				else
					printf("Search unsuccessful. %d is not at all present in the array.\n", element);
				}
				break;

				default:
					printf("Please, enter a valid choice.\n");
			}
		printf("\n");
	}while (choice != 0);

	printf("Outside do-while loop.\n");

	getch();
	

}