package sub2;
/*
 * 
 * 2022.08.24
 * 백현조
 * java 캡슐화 실습하기
 * 
 * 캡슐화 (Encapsulation)
 *  - 캡슐화는 객체의 속성(필드)을 외부에서 참조하지 못하도록 객체의 정보를 은직하는 특성
 *  - 클래스의 속성은 반드시 private 선언을 통해 캡슐화 해야한다.
 *  - 은닉된 정보의 안전한 참조를 위해 Getter, Setter를 정의한다.
 *  
 * 
 */
public class EncapuleTest {
	public static void main(String[] args) {
		//객체생성
		Car sonata = new Car("소나타","흰색",0);
		
		//Setter를 통한 속성 변경
		sonata.setColor("은색");
		
		//기능
		sonata.speed_up(100);
		sonata.speed_down(50);
		sonata.show();
		
		Account kb = new Account("국민은행","110-55321-4452","김떡배", 9999999);
		
		kb.deposit(50000);
		kb.withdraw(1000000);
		kb.show();
				
	
		
	}
}
