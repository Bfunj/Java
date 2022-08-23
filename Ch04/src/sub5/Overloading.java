package sub5;
/*
 * 2022.08.23
 * 백현조
 * java 메서드 오버로딩 실습하기
 * 
 * 메서드 오버로딩
 * - 동일한 이름으로 메서드를 배개변수로 구분한 메서드
 * - 반환타입은 오버로딩에 영향을 미치지 않음
 * 
 * 
 */
public class Overloading {
	public static void main(String[] args) {
		int sum1= name(1,2);
		int sum2= name(1,2,3);
		double sum3= name(1.1 , 2.1);
		String sum4= name("안녕","하세요");
		
		System.out.println("sum1 : "+ sum1);
		System.out.println("sum2 : "+ sum2);
		System.out.println("sum3 : "+ sum3);
		System.out.println("sum4 : "+ sum4);
	}
	
	
	public static int name(int a, int b) {
		return a+b;
	}
	public static int name(int a, int b, int c) {
		return a+b+c;
	}
	public static double name(double a, double b) {
		return a+b;
	}
	public static String name(String a, String b) {	
		return a+b;
	}
}
