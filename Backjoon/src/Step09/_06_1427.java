package Step09;



/*
 * 2022.10.17
 * 통계학
 * 백현조
 * 
 * 입력
 * - 첫째 줄에 정렬하려고 하는 수 N이 주어진다.
 * - N은 1,000,000,000보다 작거나 같은 자연수이다.
 * 
 * 출력
 * - 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _06_1427 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	int num=sc.nextInt();
	
	ArrayList<Integer> list = new ArrayList<>();
	for(int i=0; i<10 ; i++) {
		if(num/10>0) {
			list.add(num%10);
			num=num/10;
		}
		else {list.add(num); break;}		
	}
	
	Collections.sort(list, Collections.reverseOrder());
	for(int value : list) {
		sb.append(value);
	}
	System.out.println(sb);
	sc.close();
	}
}// class end






