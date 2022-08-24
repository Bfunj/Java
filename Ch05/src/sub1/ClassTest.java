package sub1;
/*
 * 
 * 2022.08.24
 * 백현조
 * java 클래스 객체 실습하기
 * 
 * 클래스와 객체
 *  - 클래스는 객체를 생성하는 구조체이고 속성(필드)과 기능으로 구성
 */
public class ClassTest {
	public static void main(String[] args) {
		//객체생성
		Car sonata = new Car();
		
		//객체 속성 초기화
		sonata.name="소나타";
		sonata.color="흰색";
		sonata.speed=0;
		
		//객체 기능 실행
		
		sonata.speed_up(100);
		sonata.speed_down(40);
		sonata.show();
		
		// 객체 생성
		Car bmw = new Car();
		
		bmw.name="BMW";
		bmw.color="검정";
		bmw.speed=0;
		
		bmw.speed_up(50);
		bmw.speed_down(20);
		bmw.show();
		
		// Account 객체 생성		
		Account kb = new Account();
		
		//초기화
		kb.bank = "국민은행";
		kb.id ="010-00203-486893";
		kb.name="김유신";
		kb.balance=0;
		
		kb.deposit(100000000);
		kb.withdraw(10000);
		kb.show();
		
		
		Account wr =new Account();
		
		wr.bank="우리은행";
		wr.id="101-1f25-55";
		wr.name="김춘추";
		wr.balance= 4440505;
		
		wr.deposit(500000);
		wr.withdraw(100000);
		wr.show();
	}
}
