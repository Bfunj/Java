package sub3;
/*
 * 
 * 2022.08.23
 * 백현조
 * method
 * 
 * 메서드(Method)
 *  - 자주 사용하는 코드로직을 모듈화한 구조체
 *  - 메서드에 선언한 변수는 지역번수이고 해당 메서드가 끝나면 메모리에서 소멸
 * 
 */
public class MethodTest {
	
	int num=1; // 메서드 밖의 선언은 전역변수
	
	public static void main(String[] args) {
		int r1 = f(1); 
		int r2 = f(2);
		int r3 = f(3);
		System.out.println("r1 = "+r1);
		System.out.println("r2 = "+r2);
		System.out.println("r3 = "+r3);
		
		
		int sum1= sum ( 1, 10 );
		int sum2= sum ( 1, 100 );
		System.out.println("sum1 = "+sum1);
		System.out.println("sum2 = "+sum2);
	} // MAIN END
	
	
	//F함수 정의
	public static int f(int x) {	// void 반환값이 없다.
		int y= 2*x+3;
		
		return y;
	}	// f메서드 end
	
	// 메서드 덩의
	public static int sum(int start, int end) {
		int total =0; // 지역변수 한번 실행 후 메모리에서 사라짐 .. 일시적인 선언
		for(int k= start; k<=end ; k++) {
			total +=k;
		}
		return total;
	}
}
