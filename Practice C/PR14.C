/*This program counts the total number of words in a file */
#include <stdio.h>
#include <stdlib.h>

int main()
{
	FILE *fp;
	char ch;
	int count = 0; /*variable to count the number of words in file */
	fp = fopen("PR1.C","r");
	if(fp == NULL)
	{
		puts("Can't open file.");
		exit(1);
	}

	while((ch = fgetc(fp)) != EOF)
	{	if(ch == ' ')
			count++;
		putchar(ch);

	}
	printf("\nThe total words are %d.\n",count);

	fclose(fp);

	return 0;

}