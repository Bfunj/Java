package sub1;

/*
 * date : 2022/08/16
 * name : BHJ
 * Contents : java 변수 실습하기 
 * 
 * 변수(variable)
 * - 데이터를 처리하기 위한 메모리 공간
 * - 데이터 변경이 가능
 * 
 * 상수(constant)
 * -데이터 변경이 불가능한 고정된 값을 갖는 변수
 */
public class VariableTest {
	public static void main(String[] args) {
		
		//변수
		String hello = "hello world";
		int a=3;
		int b=7;
		System.out.println("hello : " + hello);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		//상수		
		final int Num =5;
		//Num =7; 상수로 지정이 되었기에 변경 불가
		System.out.println("num :" + Num);
		
		
	}

}
