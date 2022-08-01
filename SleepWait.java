package thread;

public class SleepWait {
    private static Object Load = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread is woken after sleeping for 1 second");
        synchronized (Load) 
        {
            Load.wait(1500);
            System.out.println("Object is woken after waiting for 1.5 second");
        }
    }
}



