//Implements Runnable interface
class ThreadA implements Runnable{
	Thread ob;//creates a variable of type Thread

	ThreadA(){
		ob = new Thread(this, "Demo Thread");
		System.out.println("New Thread: " + ob);
	}

	public void run(){
		try {
			for(int i=5;i>0;i--){
				System.out.println("New thread's i: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Exiting new thread.");
	}
}

class NewThread{
	static public void main(String args[]){
		ThreadA o = new ThreadA();
		o.ob.start();

		try {
			for(int i=5;i>0;i--){
				System.out.println("main's i: " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Exiting main's thread.");
	}
}