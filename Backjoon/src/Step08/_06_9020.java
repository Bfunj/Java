package Step08;

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
	
		
		
		int n = sc.nextInt();
		boolean[] isPrime = new boolean[2*n+1];
		Arrays.fill(isPrime , true);
        

		
		isPrime [0] = isPrime [1] = false;
		for(int i=2; i*i<=2*n; i++){
			if(isPrime[i]){
				for(int j=i*i; j<=n; j+=i) {
					isPrime[j] = false;                
				}
			}        
		}    
		for(int i=2; i<=n ;i++){
			if(isPrime[i]) System.out.println(i);     
		}
	
		sc.close();
	}
}
