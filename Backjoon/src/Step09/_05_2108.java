package Step09;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * 2022.10.13
 * 통계학
 * 백현조
 * 
 * 입력
 * - 첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
 * - 단, N은 홀수이다.
 * - 그 다음 N개의 줄에는 정수들이 주어진다.
 * - 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
 * 
 * 출력
 * - 첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
 * - 둘째 줄에는 중앙값을 출력한다.
 * - 셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
 * - 넷째 줄에는 범위를 출력한다.
 * 
 */



public class _05_2108 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine()); // 1 <= N <=500000 (50만) 홀수
		int[] counting_plus = new int[4001]; // 수의 범위 : 0~4,000
		int[] counting_minus = new int[4001]; // 수의 범위 : 0~4,000
		double sum=0;
		int bin=0;
		ArrayList<Integer> choibin = new ArrayList<>();
		for(int i=0 ; i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num>0) counting_plus[num]++;
			else {
				num=num*(-1);
				counting_minus[num]++;
			}
		}
		br.close();
		for(int i=4000 ;i>0;i--) {
			if(bin<=counting_minus[i]) {
				choibin.add(-i);
				if(bin<counting_minus[i]) {
					choibin.clear();
					choibin.add(-i);
					bin=counting_minus[i];
				}
			}
		}
		
		for(int i=0 ; i<4001;i++) {
			
			if(bin<=counting_plus[i]) {
				choibin.add(i);
				if(bin<counting_plus[i]) {
					choibin.clear();
					choibin.add(i);
					bin=counting_plus[i];
				}
			}
		
		}
		
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i=4000 ;i>0;i--) {
			while(counting_minus[i]>0) {
				ar.add(-i);
				counting_minus[i]--;
				sum += i*(-1);
			}
		}
		for(int i=1 ;i<4001;i++) {
			while(counting_plus[i]>0) {
				ar.add(i);
				counting_plus[i]--;
				sum +=i;
			}
		}
		
		System.out.println(ar);
		
		System.out.println(Math.round(sum/N)); //첫째줄 소수첫째자리 반올림
		
		System.out.println(ar.get(N/2)); // 둘째줄
		
		
		if(choibin.size()>1) System.out.println(choibin.get(1)); // 셋째줄
		else System.out.println(choibin.get(0)); // 셋째줄
		
		System.out.println(ar.get(N-1)-ar.get(0)); // 넷째줄
		
		
	}
	
	
}// class end






