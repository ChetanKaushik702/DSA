//Demonstration of nested switch statements
class NestedSwitch{
	public static void main(String arr[]){
		int count = 1, target = 2;

		switch(count){
			case 1:
			switch(target){
				case 2:
				System.out.println(count + " " + target);
				break;
				default:
				System.out.println("Error!!");
			}
			break;

			default:
			System.out.println("Eroor!!");
		}
	}
}