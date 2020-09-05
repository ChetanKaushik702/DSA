/*Opening a file*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
	FILE *fp;
	char ch;
	static int nol,nob,noc,not;
	fp = fopen("PR1.C","r");
	if(fp == NULL)
	{
		puts("Cannot open file.");
		exit(1);
	}
	while((ch = fgetc(fp)) != EOF)
	{
	    printf("%c",ch);
		noc++;
		if(ch == '\n')
            nol++;
		if(ch == '\t')
			not++;
		if(ch == ' ')
			nob++;
	}
	printf("\n\nNumber of lines: %d\nNumber of tab-spaces: %d\nNumber of spaces: %d\nNumber of characters: %d\n",nol,not,nob,noc);
	fclose(fp);

	return 0;
}
