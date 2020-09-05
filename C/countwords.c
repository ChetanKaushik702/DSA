/* This program counts the total number of words in a line.
   A word is charcterised by non space charcters. */
#include <stdio.h>
int main()
{
	char str[80];
	int count=1; /* counter for counting words */
	puts("Enter a string:");
	gets(str);
	char *p = str;
	while(*p != '\0')
	{
		if(*p == ' ')
			count++;
		p++;
	}

	printf("Total number of words are %d.",count);
	return 0;
}