package 기본수학2;

/*
 * 2022.09.05
 * 백현조
 * 9020번문제 골드바흐의 추측
 * 
 * 어느 짝수의 절반의 제곱근 범위내에 소수 두개의 합은 처음 짝수와 같다. 
 */

import java.util.Arrays;
import java.util.Scanner;

public class _06_9020 {
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
	
		int gold_i=0;
		int alpa=0;
		int min=0;
		int max=0;
		int[] gold = new int[100];
		
		int Test_case= sc.nextInt();
		boolean[] isPrime = new boolean[10001];
		Arrays.fill(isPrime , true);
			// 소수 초기화
		isPrime [0] = isPrime [1] = false;
		for(int i=2; i*i<=10000; i++){
			if(isPrime[i]){
				for(int j=i*i; j<=10000; j+=i) {
					isPrime[j] = false;                
				}
			}        
		}// 소수 초기화 종료
		
		for(int tc=0;tc<Test_case;tc++) {
		int n = sc.nextInt();	
		Arrays.fill(gold , 0);
		// 소수 + 소수 입력값 출력 
				int test = (int) (Math.sqrt(n)*3);
				alpa=n/2-test;
				if(n/2-test<1)alpa=0;
			
		for(int i=alpa; i<=n/2+test+3 ;i++){
				if(isPrime[i]) {
				//	System.out.println(i);
					gold[gold_i]=i; gold_i++;
				}
			}
		
		for(int st=0; st<gold.length;st++) {
			for(int en=st;en<gold.length;en++) {
				if(n == (gold[st] + gold[en])) {
					min = gold[st];
					max= gold[en];
				}
				if(gold[en]==0)break;
			}
			if(gold[st]==0 || n<gold[st]*2)break;
		}// 소수 + 소수 입력값 출력 종료
		
		System.out.print(min+" ");
		System.out.print(max+"\n");		
		gold_i=0;
		alpa=0;
		min=0;
		max=0;
		
		}
		
		sc.close();
		
			
		}//main
}//class


