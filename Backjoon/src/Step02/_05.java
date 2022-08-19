package Step02;
/*
 * 
 * 2022.08.19
 * 백현조
 * 일어나야 할 시간보다 45분 일찍 일어나기
 * ex) 10 45 (10시 45분) > 10 00
 * 
 */
import java.util.Scanner;
public class _05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int h_h=0;
		int m_m=0;
		
		if(m-45>=0) {
		m_m=m-45;
		h_h=h;
		}
		else {
			if(h>0) {
			m_m=60+m-45;
			h_h=h-1;
			}
			else {
				m_m=60+m-45;
				h_h=23;
			}
		}
		sc.close();
		System.out.print(h_h);
		System.out.print(" "+m_m);	

	}
}