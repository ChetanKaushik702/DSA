#include <stdio.h>
#include <stdlib.h>

int main()
{
	FILE *fs,*ft;
	char ch;int num = 1;
	fs = fopen("File1.c","r");
	if(fs == NULL)
	{
		puts("Can't open file");
		exit(1);
	}
	ft = fopen("File.TXT","w");
	if(ft == NULL)
	{
		puts("Can't open file");
		exit(2);
	}
	printf("%d.",num++);

	while(1)
	{
		ch = fgetc(fs);
	    if(ch == EOF)
	    	break;
	    else
	    {
	    	if(ch == '\n')
	    	{
	    		printf("\n");
	    		printf("%d.",num++);
	    	}
	    	else
	    	{
	    		if(ch >='A' && ch <='Z')
	    			printf("%c",ch+32);
	    		else
	    		{
	    			if(ch >='a' && ch <='z')
	    				printf("%c",ch-32);
	    			else
	    				printf("%c",ch);
	    			
	    		}
	    	}
	    }
	}
	fclose(fs);
	fclose(ft);

	return 0;

}