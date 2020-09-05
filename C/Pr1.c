#include <stdio.h>
#define P(x)(x*x)
#define C(y)(y*y*y);

int main(){
	int i=3,j,k,b=3;
	
	j = P(i++);
	printf("%d\n",i);
	k = P(++i);
	printf("%d\n",i);
	
	//int t = C(b++);
	//printf("%d %d",t,b);
	printf("%d %d",j,k);
	return 0;
}