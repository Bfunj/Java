package Step07;

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
		if(line%2 == 0) {} // 좌측 
		else {} // 우측 
		test = suyel - num;
		System.out.println(line+"/"+(line-test));
		System.out.println("suyel :"+ suyel);
		System.out.println("line :"+ line);
		System.out.println("test :"+ test);
		sc.close();
		
	}
}
