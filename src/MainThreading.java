public class MainThreading {

	public static void main(String[] args){
		Threading t1 = new Threading();
		Threading t2 = new Threading();
		Threading t3 = new Threading();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
