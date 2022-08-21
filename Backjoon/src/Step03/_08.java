package Step03;



/*
 * 
 * 2022.08.21
 * 백현조
 * 별찍기 1
 * 
 */

import java.util.Scanner;
public class _08 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		
		for(int i=1; i<=set; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		sc.close();	
	}			
}


