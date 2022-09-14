package Step09;



/*
 * 2022.09.14
 * 수 정렬하기
 * 백현조
 * 
 * 입력
 * - 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
 * - 둘째 줄부터 N개의 줄에는 수 주어진다.
 * - 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
 * - 수는 중복되지 않는다.
 * 
 * 출력
 * - 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _01_2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int test = Integer.parseInt(bf.readLine());
		int[] arry =new int[test];
			
		for(int i =0 ; i<test ; i++) {
			arry[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(arry);
		
		for(int i : arry) {
			System.out.println(i);
		}
		
	}//main end
}// class end
