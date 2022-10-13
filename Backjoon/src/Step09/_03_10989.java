package Step09;

/*
 * 2022.10.13
 * 수 정렬하기 3
 * 백현조
 * 
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
 *  둘째 줄부터 N개의 줄에는 수가 주어진다.
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 * 
 * 출력
 * - 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_10989 {

		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(br.readLine()); // 1 <= N <=100000 (10만)
			
			int[] counting = new int[10001]; // 수의 범위 : 0~10,000

			
			
			for(int i=0 ; i<N;i++) {
				counting[Integer.parseInt(br.readLine())]++;
			}
			
			br.close();
			StringBuilder sb =new StringBuilder();
			
			for(int i=1 ;i<10001;i++) {
				while(counting[i]>0) {
					sb.append(i).append("\n");
					counting[i]--;
				}
			}
			System.out.println(sb);
			
			
		}
}// class end






