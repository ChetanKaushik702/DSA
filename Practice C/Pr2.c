/* Program to enter the numbers till the user wants and at the end it display the count of positive, negative and zeroes entered.*/
#include <stdio.h>
int main()
{
	static int pos_no, neg_no, zero_no;
	int input_no;char ch = 58;
	printf("Enter a number: ");
	scanf("%d",&input_no);
	while(1)
	{
		if(input_no == -1)
			break;
		if(input_no > 0)
			pos_no++;
		else
		{
			if(input_no < 0)
				neg_no++;
			else
				zero_no++;
		}
		scanf("%d",&input_no);
	}
	printf("Total\n\tpositive numbers %c %d\n\tnegative numbers %c %d\n\tzero     numbers %c %d.\n",ch,pos_no,ch,neg_no,ch,zero_no);

	return 0;
}