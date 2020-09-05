import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int num = sc.nextInt();
		    int sum = num/100;
		    if(num % 100 == 0)
		        System.out.println(sum);
		    else{
		        num %= 100;
		        sum += num/50;
		        if(num % 50 == 0)
		          System.out.println(sum);
		        else{
		            num %= 50;
		            sum += num/10;
		            if(num % 10 == 0)
		                System.out.println(sum);
		            else{
		                num %= 10;
		                sum += num/2;
		                if(num % 2 == 0)
		                    System.out.println(sum);
		                else{
		                    num %= 2;
		                    sum += num;
		                    System.out.println(sum);
		                }
		            }
		        }
		    }
		}
    }
}