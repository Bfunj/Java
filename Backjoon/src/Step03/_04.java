package Step03;
/*
 * 
 * 2022.08.20
 * 백현조
 * 영수증
 * 첫줄에 총 금액 입력
 * 둘째줄 물품 종류의 수
 * 셋째줄 물건의 금액 갯수
 * 
 * 출력 값 영수증의 금액과 물품들의 금액 합이 같으면 yes 틀리면 no
 * 영어단어
 */

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int  receipt = sc.nextInt();
		int  kind = sc.nextInt();
		
		for(int j=1; j<=kind; j++) {
			int  price = sc.nextInt();
			int  set = sc.nextInt();
			receipt = receipt-price*set;
			}
		if (receipt == 0) { System.out.println("Yes");}
		else System.out.println("No");
		sc.close();
	}
}
