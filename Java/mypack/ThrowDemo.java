//Demonstrate throw.
class ThrowDemo{
	static void demoproc(){
		try {
			throw new NullPointerException();
	    } catch(NullPointerException e){
			System.out.println("Exception caught in: " + e);
			throw e; // rethrows the exception
		}
	}

	public static void main(String[] args){
		try {
			demoproc();
		} catch(NullPointerException e){
			System.out.println("Recaught: " + e);
		}
	}
}