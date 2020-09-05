/*File-copy program which copies text, .com and .exe files*/
#include <fcntl.h>
#include "sys\\stat.h"
#include "sys\\types.h"
#include <stdlib.h>
#include <stdio.h>
int main()
{
    char buffer[512],source[128],target[128];
    int inhandle, outhandle, bytes;
    printf("\nEnter source filename: ");
    gets(source);

    inhandle = open(source,O_RDONLY | O_BINARY);
    if(inhandle == -1)
    {
        puts("Cannot open file.");
        exit(1);
    }
    printf("\nEnter target filename: ");
    gets(target);
    outhandle = open(target,O_CREAT | O_BINARY | O_WRONLY, S_IWRITE);
    if(outhandle == -1)
    {
        puts("Cannot open file.");
        close(inhandle);
        exit(2);
    }

    while(1)
    {
        bytes = read(inhandle,buffer,512);
        if(bytes == 0)
            break;
        write(outhandle,buffer,bytes);
    }
    close(inhandle);
    close(outhandle);

    /*read target file in binary mode*/
    outhandle = open(target,O_RDONLY | O_BINARY);
    if(outhandle == -1)
    {
        printf("Can't open file.");
        exit(3);
    }
    while(1)
    {
        bytes = read(outhandle,buffer,512);
        if(bytes == 0)
            break;
        int ch[bytes];
        for(int i=0;i<bytes;i++)
            printf("%d",ch[i]);
    }
    close(outhandle);
    return 0;
}
