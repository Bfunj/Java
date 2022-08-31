package Step07;



/*
 * 
 * 2022.08.31
 * 백현조
 * 
 * 설탕배달
 * 
 * 
 * 3키로 봉지와 5키로 봉지가 있음
 * 
 * 키로수가 주어질때 봉지로 담을수 있는 최소한의 수
 * 
 * 수로 떨어지지 않으면 -1 출력
 * 
 */
import java.util.Scanner;

public class _06_2839 {
	public static void main(String[] args)  {
		
		Scanner sc =new Scanner(System.in);
		
		int result=suga(sc.nextInt());
		
		System.out.println(result);
		sc.close();
	}
	
	public static int suga(int a) {	
		
		int result=10000;	
		int result_1=10000;	
		int result_2=10000;
		
		if(  (a%3 ==0 && a%5 ==0)  || (a%3 !=0 && a%5 == 0) ) {
			result_1 = a/5;
			return result_1;
		}
		else if (a%3 ==0 && a%5 !=0) {
			result_1 = a/3;
		}	
		for(int count_3=1;;count_3 ++) {
			a=a-3;
			if(a%5 ==0) {
				result_2 = a/5 + count_3;
				break;
			}
			if(count_3>30|| a<0) {
				return result=-1;
			}
			
			}
		
		if(result_1 <result_2) result = result_1;
		else result = result_2;
	
		return result;
	}
}
