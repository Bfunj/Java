package Step01;

import java.util.Scanner;

/*
 * 
 * 2022/08/19
 * 백현조
 * 체스판
 * 검정 체스 다있음 흰색 체스 몇개 없음
 * 킹1 퀸1 룩2 비숍2 나이트2 폰 8 구성
 * 흰수 갯수가 주어질때 몇개를 더하고 빼야하는지 출력
 * 
 */
public class _10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ki = sc.nextInt();
	int qu = sc.nextInt();
	int ro = sc.nextInt();
	int bi = sc.nextInt();
	int kn = sc.nextInt();
	int ph = sc.nextInt();
	
	System.out.print(1-ki);
	System.out.print(" ");
	System.out.print(1-qu);
	System.out.print(" ");
	System.out.print(2-ro);
	System.out.print(" ");
	System.out.print(2-bi);
	System.out.print(" ");
	System.out.print(2-kn);
	System.out.print(" ");
	System.out.print(8-ph);
	
	sc.close();
}
}