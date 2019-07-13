package threadlesson1;

//creating threads by extending thread class
class myclass extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getId() + " Value " +i);
		}
	}
}
public class ThreadClass {

	public static void main(String[] args) {
		myclass class1 = new myclass();
		class1.start();
		myclass class2 = new myclass();
		class2.start();
	}

}
