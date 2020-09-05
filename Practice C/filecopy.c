/*File-copying program*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
                FILE *ft,*fs;
                char ch;
                char source[15],target[15];
                printf("Enter source filename: ");
                scanf("%s",source);
                fs = fopen(source,"r");
                if(fs == NULL)
                {
                    puts("Cannot open source file.");
                    exit(1);
                }
                printf("Enter target filename: ");
                scanf("%s",target);
                ft = fopen(target,"w");
                if(ft == NULL)
                {
                    printf("Cannot open target file.");
                    fclose(fs);
                    exit(2);
                }
                while((ch = fgetc(fs)) != EOF)
                    fputc(ch,ft);

                fclose(fs);
                fclose(ft);
                ft = fopen(target,"r");
                if(ft == NULL)
                {
                    puts("Cannot open target file.");
                    exit(3);
                }
                while((ch = fgetc(ft)) != EOF)
                    printf("%c",ch);
                fclose(ft);

    return 0;
}
