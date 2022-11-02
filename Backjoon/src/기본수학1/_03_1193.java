package 기본수학1;

/*
 * 
 * 2022.08.29
 * 백현조
 * 분수찾기
 * 
 */

import java.util.Scanner;

public class _03_1193 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		int line = 0;
		int suyel =0;
		int test=0;
		for ( int i =0; suyel<num ; i++) {
			suyel += i;
			line=i;		
		}
			test = suyel - num;
		if(line%2 == 0) {
			System.out.println(line-test+"/"+ (1+test) );
		} // 좌측 
		else {System.out.println( (1+test) +"/"+ (line-test) );} // 우측 
		sc.close();
		
	}
}
