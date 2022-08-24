package Step04;



/*
 * 
 * 2022.08.23
 * 백현조
 * 평균
 * ox 문제
 * 
 */

import java.util.Scanner;
public class _05 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); //스캐너 선언
		char[] oxox = new char[80]; // char 80 배열 선언
		int sum =0;
		int count =0;
		int set = sc.nextInt(); // 반복할 횟수 입력 받음
		for (int j=0; j<set ; j++) { //set 수만큼 반복
			
			String ox = sc.next(); // 문자열로 oxoxoxoxo 받음
			for(int i=0; i < ox.length(); i++) {
					oxox[i]=ox.charAt(i);
				}// 입력받은 문자열은 각 char 배열에 하나씩 지정
			
			for(int i =0; i< ox.length(); i++) {
					if(oxox[i] == 'O') {
						count ++;
						sum+=count;
					} // 문자가 o 이면 카운트를 하나 증가 시키고 sum에 누적
					else count=0; // x를 만나면 카운트 값 초기화
				}
		System.out.println(sum); // 출력
		sum=0; // sum 초기화
		count=0; // count 초기화
		}
		sc.close();
	}
}