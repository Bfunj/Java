package sub1;
/*
 * 2022.09.05
 * 백현조
 * java object 클래스 실습하기
 * 
 */
public class ObjectTest {
	 public static void main(String[] args) {
		
		 Apple a1 = new Apple("한국",5000);
		 Apple a2 = new Apple("일본",2000);
		 
		 a1.show();
		 a2.show();
		 
		if(a1==a2) {
			System.out.println("a1과 a2는 주소가 같다.");
		}else System.out.println("a1과 a2는 주소가 다르다.");
			 
		if(a1.equals(a2)) {
			System.out.println("a1과 a2는 객체가 같다.");
		}else System.out.println("a1과 a2는 객체가 다르다.");
		 
		// toSring 객체정보
		a1.toString();
		a2.toString();
		
		
		 
	}//main
}//class
