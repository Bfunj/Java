package 기본수학2;



import java.util.Arrays;
import java.util.Scanner;

public class _05_4948 {
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int count=0;
		
		while(true) {
		int n = sc.nextInt();
		boolean[] isPrime = new boolean[2*n+1];
		Arrays.fill(isPrime , true);
        
		if(n<1)break;
		
		isPrime [0] = isPrime [1] = false;
		for(int i=2; i*i<=2*n; i++){
			if(isPrime[i]){
				for(int j=i*i; j<=2*n; j+=i) {
					isPrime[j] = false;                
				}
			}        
		}    
		for(int i=n+1; i<=2*n ;i++){
			if(isPrime[i])   count++;   
		}System.out.println(count);  
		count=0;
		
		}
		sc.close();
	}
}
