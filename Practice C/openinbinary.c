/*Opening a file in binary mode*/
#include <stdio.h>
#include <stdlib.h>
struct employee
{
    char name[25]; int age; int bs;
};
int main()
{
                typedef struct employee se;
                se e[2];
                FILE *fp;
                char ch;
                fp = fopen("target.txt","w");
                if(fp == NULL)
                {
                    puts("can't open file.");
                    exit(1);
                }
                for(int i=0;i<2;i++)
                {
                    printf("Name, age and basic salary of employee %d:",i+1);
                    scanf("%s %d %d",&e[i].name,&e[i].age,&e[i].bs);
                    fflush(stdin);
                }
                for(int i=0;i<2;i++)
                    fprintf(fp,"%s %d %d",e[i].name,e[i].age,e[i].bs);
                fclose(fp);

                /*Read data written above*/
                fp = fopen("target.txt","r");
                if(fp == NULL)
                {
                    printf("Can't open target file.");
                    exit(2);
                }

                for(int i=0;i<2;i++)
                {
                    while(fscanf(fp,"%s %d %d",&e[i].name,&e[i].age,&e[i].bs)!=EOF)
                        printf("%s %d %d\n",e[i].name,e[i].age,e[i].bs);
                }
                fclose(fp);

            /*Binary Operation begins*/
            fp = fopen("target.txt","wb");
            if(fp == NULL)
                {
                    puts("can't open file.");
                    exit(3);
                }
                for(int i=0;i<2;i++)
                {
                    printf("Name, age and basic salary of employee %d:",i+1);
                    scanf("%s %d %d",&e[i].name,&e[i].age,&e[i].bs);
                    fflush(stdin);
                }
                for(int i=0;i<2;i++)
                    fwrite(&e[i],sizeof(se),1,fp);

                fclose(fp);
                fp = fopen("target.txt","rb");

                    if(fp == NULL)
                    {
                        printf("Can't open target file.");
                        exit(4);
                    }
                    for(int i=0;i<2;i++)
                    {
                        while(fread(&e[i],sizeof(se),1,fp) == 1)
                            printf("%s %d %d\n",e[i].name,e[i].age,e[i].bs);
                    }

                    fclose(fp);
                return 0;
}
