#include <stdio.h>
#include <stdlib.h>

int main()
{
	FILE *fp;
	char ch;
	int num = 1;
	fp = fopen("Square.c","r");
	if(fp == NULL)
	{
		puts("Can't open file.");
		exit(1);
	}
	printf("%d. ",num);
	num++;
	while(1)
	{
		ch = fgetc(fp);
		if(ch == EOF)
			break;
		else
		{
			if(ch == '\n')
			{
				printf("\n");
				printf("%d. ",num);
					num++;
			}			
			else
				printf("%c",ch);
		}
	}

	fclose(fp);
	return 0;
}