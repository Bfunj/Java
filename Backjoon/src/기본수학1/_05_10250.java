package 기본수학1;



/*
 * 
 * 2022.08.30
 * 백현조
 * 
 * 0층의 n호실 방 은 n명이 살아야함
 * 1층의 n번방은 아래층의 1호실부터 n호실까지의 인원수 합한만큼 살아야함
 * t층의 n번방은 t-1층의 1호실부터 n호실까지의 인원수 합한만큼 살아야함
 * 이때 t층 n번방의 인원은?
 * 
 * 1<= k,n <=14
 * 
 */
import java.util.Scanner;

public class _05_10250 {
	public static void main(String[] args)  {
		
		Scanner sc =new Scanner(System.in);
		int Test= sc.nextInt();
		int human=0;
		for(int q=0;q<Test;q++) {
			int T= sc.nextInt();
			int n=sc.nextInt();
		human= hosu (T,n);
		System.out.println(human);	
		}
		sc.close();		
	}
	
	public static int hosu(int a, int b) {	
		int[][] ingu= new int[15][15];
		for(int i=0;i<15;i++) {
			ingu[0][i]=i+1;
			ingu[i][0]=1;
		}
		if(a>0) {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<b;j++) {			
					ingu[i][j]= ingu[i-1][j]+ingu[i][j-1];
				}			
			}					
		}		
		return ingu[a][b-1];
		}
}
