package sub01;
/*
 * 
 * 
 * 
 * 
 */
public class LambdaThread {

	public static Runnable r = () -> {
		for(int i=1; i<=10 ;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("서브 스레드 실행...");
		}
	};
	
	public static void main(String[] args) {
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("메인 스레드 실행");
		}
		System.out.println("프로그램 종료...");
	}
}
