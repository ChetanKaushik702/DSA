#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int main()
{
    int n, times, *p, t=0, min = INT_MAX, control=1;
    printf("Enter n and times: "); scanf("%d %d",&n,&times);
    p = malloc(sizeof(int) * (n/2));

    while(control <= times)
    {
        for(int i=2;i<=n;i++)
        {
            if(n % i == 0)
            {
                p[t] = i;
                t++;
            }
        }
        for(int j=0;j<t;j++)
            if(min > p[j])
                min = p[j];
        n = n + min;
        control++;
    }

    printf("The desired result is %d.",n);
}
