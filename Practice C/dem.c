/* Convert a string "124" to an integer 124 */
#include <stdio.h>
#include <string.h>
int main()
{
    char num[4];
    printf("Enter a number string: "); scanf("%s",num);
    int number = 0;

    for(int i=0;i<strlen(num);i++)
       number = number*10 + (num[i]-48);

    printf("Finally, number is %d.\n",number);
    return 0;
}
