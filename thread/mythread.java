package thread;
// creating our thread using  runable interface
public class mythread implements Runnable{
	public void run() {
		
		// task for thread
		for(int i=1;i<=10;i++) {
			
			System.out.println("value of i is"+i);
				try {
					Thread.sleep(100);
				}
				catch (Exception e) {
				}
		}
		}
	public static void main(String[] args) {
		
		// creating object  mythread class
		mythread t=new mythread();// no run method thread
		
		Thread t1=new Thread(t); // creating helper class objecct
		
		// object of another thread
		
		MyAnotherThread t2=new MyAnotherThread();
		t1.start();
		t2.start();
	}

}
