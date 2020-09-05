// Break as a civilised form of goto
class Break{
	public static void main(String[] args){
		one: for(var i=0;i<2;i++){
			two: for(int j=i;j<2;j++){
				System.out.println("Inside the body of loop two.");
				three: for(int k=0;k<2;k++) break one;
			}
			System.out.println("Inside the body of loop 1.");
		}
		System.out.println("Outside all the loops.");
	}
}