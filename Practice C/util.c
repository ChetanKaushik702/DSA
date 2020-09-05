/* This program receives command line arguments*/
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	FILE *fs,*ft;
	char ch;
	if(argc !=3 )
	{
		printf("Improper number of arguments.");
		exit(1);
	}
	fs = fopen(argv[1],"r");
	if(fs == NULL)
	{
		puts("Can't open source file.");
		exit(2);
	}
	ft = fopen(argv[2],"w");
	if(ft == NULL)
	{
		puts("Can't open target file.");
		fclose(fs);
		exit(3);
	}
	while(!feof(fs))
	{
		ch = fgetc(fs);
		fputc(ch,ft);
	}
	fclose(fs);
	fclose(ft);

	ft = fopen(argv[2],"r");
	if(ft == NULL)
	{
		puts("Can't open target file.");
		exit(4);
	}
	while((ch = fgetc(ft)) != EOF)
		printf("%c",ch);

	fclose(ft);
	return 0;
}