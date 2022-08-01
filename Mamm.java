package thread;
public class Mamm extends Thread {
	public void run() {
		for(int i= 1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
  public static void main(String[] args) {
	  Mamm t1 = new Mamm();
	  t1.start();
	  System.out.println("Thread is running....");
  }
}