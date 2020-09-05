//Demonstration of main thread
class MainThread{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		t.setPriority(1);
		System.out.println("Name of thread is: " + t);

		t.setName("My Thread");
		System.out.println("Now, name of thread is: " + t.getName());

		try {
			 for(int i = 5; i > 0; i--){
			 	System.out.println("i is: " + i);
			 	t.sleep(1000);
			 }
		} catch(InterruptedException e){
			System.out.println("Thread interrupted.");
		}
	}
}