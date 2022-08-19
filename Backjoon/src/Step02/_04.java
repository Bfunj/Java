package Step02;
/*
 * 
 * 2022.08.19
 * 백현조
 * 좌표가 주어지면 4사분면의 위치 판별하기
 * 
 * 
 */
import java.util.Scanner;
public class _04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}
		if(x<0 && y>0) {
			System.out.println("2");
		}
		if(x<0 && y<0) {
			System.out.println("3");
		}
		if(x>0 && y<0) {
			System.out.println("4");
		}sc.close();
	}

}
