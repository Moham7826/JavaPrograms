package thread;
import java.lang.Thread;

public class Thrd implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for(int o = 1;o<=5;o++) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread using interface .....");
		Thread.sleep(500);
		Thrd obj = new Thrd();
		Thread Thrd = new Thread(obj);
		obj.run();
	}
}