package sub2;

/*
 * 
 * date : 2022/08/16
 * name : BHJ
 * cont : 변수의 자료형 실습하기
 * 
 */
public class DataTypeTest {
	public static void main(String[] args) {
	
		// 정수형
		byte num1 =127; // -128~127
		short num2 = 32767; // -32768~32767
		int num3 = 2147483647; // -2147483648 ~ 2147483647
		long num4 = 2147483648L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);

		// 실수형
		float var1 = 0.123456789f;
		double var2 = 0.12345678913456d;
		
		System.out.println("var1 : "+ var1);
		System.out.println("var2 : "+ var2);
		
		// 논리형		
		boolean or1 = false;
		boolean or2 = true;
		System.out.println("or1 : "+ or1);
		System.out.println("or2 : "+ or2);
		
		// 문자형
		char chh1 ='a';
		char chh2 ='b';
		System.out.println("chh1 : "+ chh1);
		System.out.println("chh2 : "+ chh2);
	
		
		// 문자열
		String str1 = "gogogogogo";
		System.out.println("str1 : "+ str1);
}
}
