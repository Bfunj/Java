package sub4;
/*
 * 
 * 2022.08.23
 * 백현조
 * java 매서드 타입 실습하기
 * 
 * 
 * 
 */
public class MetohdTypeTest {

	public static void main(String[] args) {
	double r1= type1(1.1);
	double r2= type1(1.2);
		
	System.out.println("r1 : "+r1);
	System.out.println("r2 : "+r2);
	
	type2(true);
	type2(false);
	
	
	boolean a1= type3();
	System.out.println("a1 : "+a1);
	
	type4();
	
	}//main end
	
	//type 1 : 매개변수 o, 리턴값 o
	public static double type1(double x) {
		double y= x+3.14;
		return y;
	}
	//type 2 : 매개변수 o, 리턴값 x
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다");
		}else System.out.println("거짓 입니다.");
	}
	//type 3 : 매개변수 x, 리턴값 o
	public static boolean type3() {
	int num1 = 1;
	int num2 = 2;
	if(num1> num2) {
		return true;
	}else return false;
	}
	//type 4 : 매개변수 x, 리턴값 x
	public static void type4() {
		
		System.out.println("type4 result : "+ type1(1.2));
	}
}
