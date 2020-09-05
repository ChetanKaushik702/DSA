import java.util.Scanner;

class TotalExpenses{
		public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-- > 0){
		    int qty = sc.nextInt();
		    int pricePerItem = sc.nextInt();
		    double totalprice = qty * pricePerItem;
		    if(qty > 1000)  System.out.println(totalprice * 0.90);
		    else    System.out.println(totalprice);
		}
	}
}