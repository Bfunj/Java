package Step04;

import java.util.Scanner;

public class _baek_2563 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		boolean[][] Dohwaji = new boolean[100][100];
		int print_su = sc.nextInt(); //100이하
		int a=0;
		int b=0;
		int sum=0;
		for(int i =0; i<print_su;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			for(int j=a;j<a+10;j++) {
				for(int k=b;k<b+10;k++) {
					Dohwaji[j][k]=true;
				}
			}
		}
		
		for(int j=0;j<100;j++) {
			for(int k=0;k<100;k++) {
				if(Dohwaji[j][k]==true) {
					sum++;
				}
			}
		}
		
		System.out.println(sum);
		sc.close();
		
		
		
		
	}
}
