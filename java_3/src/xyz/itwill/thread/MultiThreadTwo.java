package xyz.itwill.thread;

public class MultiThreadTwo implements Runnable {
	@Override//오버라이딩 하면 try~catch만 가능,throws 불가능
	public void run() {
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}