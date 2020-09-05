/*This program defines a function that receives 4 integers and returns their sum, product and average*/
#include <stdio.h>
void sum_pro_avg(int, int, int, int, int *, int *, float *);
int main(){
	int a, b, c, d, sum, product;
	float average;
	printf("Enter 4 integers:\n");
	scanf("%d %d %d %d",&a,&b,&c,&d);
	sum_pro_avg(a,b,c,d,&sum,&product,&average);

	printf("Sum     = %d\nProduct = %d\nAverage = %4.2f\n",sum,product,average);

	return 0;
}
void sum_pro_avg(int a, int b, int c, int d, int *sum, int *pro, float *avg)
{
	*sum = a + b + c + d;
	*pro = a * b * c * d;
	*avg = *sum/4.0;
}