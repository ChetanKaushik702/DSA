//Handle an exception and move on.
import java.util.Random;

class HandleError{
	public static void main(String[] args){
		int a, b, c;
		a = b = c = 0;

		Random rand = new Random();
		for(int i=0;i<32;i++){
			try{
				b = rand.nextInt();
				c = rand.nextInt();
				a = 12345 / (b/c);
			}catch(ArithmeticException e){
				System.out.println("Exception: " + e);
				a = 0; //set a to zero and continue
			}
			System.out.println("a: " + a);
		}
	}
}