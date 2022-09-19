package sub03;
/*
 * 
 * 2022.09.19
 * 백현조
 * 스레드 활용 실습하기
 * 
 */
public class ThreadAddTest {
	public static void main(String[] args) throws InterruptedException {
		
		
		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);
		
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		int ror1= at1.getNum();
		int ror2= at2.getNum();
		
		int total = ror1 + ror2;
		System.out.println("1부터 100까지 합 :"+ total);
	}
}
