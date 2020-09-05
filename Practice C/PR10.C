/*This program creates an array of pointers of 10 cities and sorts their names in reverse alphabetical order.
  Also, it prints this sorted list.*/

#include <stdio.h>
#include <string.h>

int main(){
   const char *names[] = {
                        "Ahmedabad",
                        "Gujarat",
                        "Lucknow",
                        "Delhi",
                        "Mumbai",
                        "Kanpur",
                        "Roorkie",
                        "Jaipur",
                        "Faridabad",
                        "Palwal"
                    };
                for(int i=0;i<9;i++){
                    for(int j=0;j<9-i;j++)
                    {
                        if(strcmp(*(names + j),*(names + j + 1)) < 0)
                        {
                           const char* temp = names[j];
                                 names[j] = names[j+1];
                                 names[j+1] = temp;
                        }
                    }
                }
                printf("The names in the reverse sorted alphabetical order are:\n");
                for(int i=0;i<10;i++)
                    printf("%s\n",*(names + i));

    return 0;
}
