package Step04;

import java.util.Scanner;

public class _baek_2566 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		int[][] num =new int [10][10];
		int max=0;
		int max_i=1;
		int max_k=1;
		
		for(int i=1 ; i<10 ; i++) {
			for(int k=1 ; k<10 ; k++) {
				num[i][k]=sc.nextInt();
				if(max<num[i][k]) {
					max = num[i][k];
					max_i=i;
					max_k=k;
				}
			}
		}
		System.out.println(max);
		System.out.println(max_i+" "+max_k);
	
		sc.close();
	}
}
