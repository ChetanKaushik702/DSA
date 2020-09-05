/*This program adds a sub-string to a string */
#include <stdio.h>

int main()
{
	char strapp[120], substr[50];
	int pos,i;// pos variable to hold position
	char *p;// sets up a pointer to hold the base address of substring 
	puts("Enter a string:");
	gets(strapp);
	puts("Enter a sub-string:");
	gets(substr);

	printf("Now, enter position where you would like to add this sub-string to the main string: ");
	scanf("%d",&pos);
	i = pos-1;
	p = substr; // Assigns the base address of sub-string to pointer variable p 


			while(*p != '\0')
			{
				strapp[i] = *p;
				p++;
				
			}
		puts("Now, string is:");
		puts(strapp);
	
	return 0;
}