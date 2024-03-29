package threadlesson1;

public class JoinClass {

	private static int count=0; 
	
	public static synchronized void inccount() {
		count++;
	}
	
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<=10000;i++) {
					inccount();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<=10000;i++) {
					inccount();
				}
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Value : " +count);
	}

}
