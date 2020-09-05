import java.util.Scanner;

class CielReceipt{
	static int ans=1;
	static void recur(int x){
		int num = x, count=0;

		while(x != 1){
			if(x >= 2)
				count++;
			if(count > 11){
				ans = num / 2048;
				break;
			}
			x /= 2;
		}
	if(count <= 11){
		if((num - (int)Math.pow(2, count)) == 0){
			System.out.println(ans);
			return;
		} else{
				 if((num - (int)Math.pow(2, count)) == 1){
				 		System.out.println(ans + 1);
				 		return;
				} else{
					ans++;
					recur(num - (int)Math.pow(2, count));					
				}
		}
	} else {
				if((num - ans*2048) == 0){
					System.out.println(ans);
					return;
				} else {
							if((num - ans*2048) == 1){
								System.out.println(ans + 1);
								return;
							} else {
										ans++;
										recur(num - (ans-1)*2048);
							}
				}
							
		}
	
	}
	static public void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		while(T-- > 0){
			int num = sc.nextInt();
			recur(num);
			ans = 1;
		}
		sc.close();
	}
}