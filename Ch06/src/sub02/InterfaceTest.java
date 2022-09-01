package sub02;

import sub02.Car;
import sub02.Sedan;
import sub02.Truck;

/*
 * 2022.09.01
 * 백현조
 * 인터페이스 실습하기
 * 
 */
public class InterfaceTest {
	public static void main(String[] args) {
		Car sonata =new Sedan("소나타","흰색",0);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		Car bongo =new Truck("봉고","파란색",0);
		bongo.speedUp(100);
		bongo.speedDown(40);
		bongo.show();
		
		// 인터페이스를 활용한 결합도 완화
		
		
		
	}
}
