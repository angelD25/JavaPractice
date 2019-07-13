package threadlesson1;

//creating threads by implementing Runnable interface
class urclass implements Runnable{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getId()+" value "+i);
		}
	try {
		Thread.sleep(100);
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
 }
}

public class RunnableClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new urclass());
		Thread t2 = new Thread(new urclass());
		t1.start();
		t2.start();
	}

}
