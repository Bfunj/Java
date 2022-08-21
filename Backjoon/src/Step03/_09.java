package Step03;



/*
 * 
 * 2022.08.21
 * 백현조
 * 별찍기 2
 * 
 */

import java.util.Scanner;
public class _09 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		
		for(int i=1; i<=set; i++) {
			for(int k=i;k<set;k++) {
				System.out.print(" ");
			}		
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		sc.close();	
	}			
}



