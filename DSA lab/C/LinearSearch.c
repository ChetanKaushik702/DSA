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

		for (i=0; i<SIZE; i++) 
			if (arr[i] == element) {
				flag = 1;
				break;
			}

		if (flag)
			printf("%d is present in the array at position %d.\n", element, i+1);
		else
			printf("%d is not present in the array.\n", element);

		getch();
		
}
