public class Threading extends Thread {

	public void run(){
		String tName = Thread.currentThread().getName();
		int tPriotity = Thread.currentThread().getPriority();
		for(int i=0;i<10;i++){
			try{
				System.out.println("Executing Thread : "+tName+" With Priority : "+tPriotity);
				System.out.println("Prinitning Number : "+i);
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
