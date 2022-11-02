package 반복문;



/*
 * 
 * 2022.08.21
 * 백현조
 * A+B
 * 
 */

import java.util.Scanner;
public class _10 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=1; i<=set; i++) {
			int A = sc.nextInt();
			if(A<x) {System.out.print(A+" ");}
		}
		sc.close();	
	}			
}
