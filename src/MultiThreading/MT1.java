package MultiThreading;

public class MT1 {
	public static void main(String[] args) {
	warrior w=new warrior();
	Thread t1=new Thread(w);
	Thread t2=new Thread(w);
	t1.setName("RAMA");
	t2.setName("RAVANA");
	t1.start();
	t2.start();
}
	}

class warrior implements Runnable
{
	String res1="Sarpastra";
	String res2="Pushpastra";
	String res3="Brhamastra";
	public void run()
	{
		try{
			Thread t=Thread.currentThread();
			String name=t.getName();
		if(name.contentEquals("RAMA")) {
			ramaAccResource();
		}
		else {
			ravanaAccResource();
		}
		}	
		catch(Exception e) {
			System.out.println("War is Interrupted");
		}
	    	}
	public void ramaAccResource() throws Exception
	{
		Thread.sleep(3000);
		synchronized(res2) {
			System.out.println("RAMA has aquired"+" "+res2);
			Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("RAMA has aquired"+" "+res3);
			}
		}
	}
	public void ravanaAccResource() throws Exception{
		Thread.sleep(3000);
		synchronized(res2) {
			System.out.println("RAVNA has aquired"+" "+res2);
			Thread.sleep(3000);
			synchronized(res3) {
				System.out.println("RAVNA has aquired"+" "+res3);
			}
		}
		
	}
	
}