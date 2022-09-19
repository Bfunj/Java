package sub02;
/*
 * 
 * 2022.09.19
 * 백현조
 * 스레드 join 실습하기
 * 
 * 스레드 join
 * - 메인 스레드에서 파생된 자식 스레드 작업이 완료된 후 다시 메인스레드로 합류
 * - 메인 스레드에서 자식 스레드 작업완료를 대기
 */
public class ThreadJoinTest {
	public static void main(String[] args) throws InterruptedException {
		Count count = new Count();
		
		CountTread ct1 = new CountTread(count);
		CountTread ct2 = new CountTread(count);
		CountTread ct3 = new CountTread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		
			ct1.join();
			ct2.join();
			ct3.join();
		
		
		System.out.println("결과 : "+count.getNum());
	}
}