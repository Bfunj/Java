package 기본수학1;
/*
 * 
 * 2022.08.29
 * 백현조
 * 손익분기점
 * A 고정비용
 * B 가변비용
 * C 판매 비용
 * z 갯수
 * Cz > A+Bz 가 되는 손익분기점이 발생하는 z 
 * 
 */
import java.util.Scanner;

public class _01_1712 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cost_a =sc.nextInt(); // 고정비용
		int cost_b =sc.nextInt(); // 가변비용
		int cost_c =sc.nextInt(); // 판매비용
		
		int son =0;
		if( cost_a==0) {
			cost_a=1;
		}
		if(cost_b >= cost_c) {
			son =-1;
		}
		else {
		son = cost_a / (cost_c - cost_b );
		son +=1;
		}
		
		
		
		System.out.println(son);
		sc.close();
		
	}
}
