/*String I/O copying program*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    FILE *ft;
    char s[80];
    ft = fopen("target.txt","w");
    if(ft == NULL)
    {
        printf("Can't open file.");
        exit(1);
    }

    while(strlen(gets(s)) > 0)
    {
        fputs(s,ft);
        fputs("\n",ft);
    }
    fclose(ft);

    /*Read the data written*/
    ft = fopen("target.txt","r");
    if(ft == NULL)
    {
        printf("Can't open target file.");
        exit(2);
    }
    while(fgets(s,79,ft) != NULL)
        printf("%s",s);
    fclose(ft);

    return 0;
}
