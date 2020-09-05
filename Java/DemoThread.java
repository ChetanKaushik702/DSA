package multithreading;

class NewThread implements Runnable {
	Thread t; // Variable of type "Thread"
	String name;

	NewThread(String name) {
		this.name = name;
		t = new Thread(this, this.name);
		System.out.println("Thread: " + t);
	}

	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		}	catch(InterruptedException e) {
				System.out.println("Interrupted Exception occured.");
		}
		System.out.println("Exiting from thread: " + name);
	}
}

class DemoThread {
	static public void main(String[] args) throws InterruptedException {
		NewThread nt1 = new NewThread("One");
		NewThread nt2 = new NewThread("Two");
		NewThread nt3 = new NewThread("Three");

		// Intiating run() method of each of the threads by invoking their start() methods.
		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		// Using join() method to determine whether the thread upon which it is invoked is still running or not.
		nt1.t.join();
		nt2.t.join();
		nt3.t.join();

		System.out.println("Exiting from the main thread.");
	}
}