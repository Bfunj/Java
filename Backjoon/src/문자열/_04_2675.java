package 문자열;



/*
 * 
 * 2022.08.26
 * 백현조
 * 2675번 문제
 * 문자열 반복 
 * 
 */
import java.util.Scanner;
public class _04_2675 {
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	int set = sc.nextInt();
	
	for(int i=0; i<set; i++) {
		int r = sc.nextInt();
		String str = sc.next();
		for(int j=0;j<str.length();j++) {
				for(int k=0 ; k<r ; k++) {
					System.out.print(str.substring(j,j+1));
				}
		}System.out.println();
	}
	sc.close();
}
}
