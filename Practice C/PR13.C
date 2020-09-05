/*This program computes the product of 2 integers using bitwise operators */
#include <stdio.h>

int add(int,int);
int main(){
	int a, b, result = 0 ;
	printf("Enter 2 integers to be multiplied:\n");
	scanf("%d %d",&a,&b);

	while(b != 0){
		if(b & 1)
			result = add(result, a);

		a <<= 1;
		b >>= 1;
	}

	printf("Result : %d\n",result);

	return 0;
}

int add(int x, int y)
{
	while(y != 0)
	{
		int carry = y & x;
		x = x ^ y;
		printf("carry is %d\tx is %d\n",carry,x);
		y = carry << 1;
	}

	return x;
}