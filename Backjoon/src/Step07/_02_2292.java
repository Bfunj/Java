package Step07;
/*
 * 
 * 2022.08.29
 * 백현조
 * 벌집
 * 
 * 1 6 12 18 24 30 36 42 48 
 * 7 19 37 61 91 127 169 217
 */
import java.util.Scanner;

public class _02_2292 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bee_su = sc.nextInt();
		int bee_site_1 = (bee_su-1)/6;
		int suyel=0;
		int room=0;
		//등차수열 1 2 3 4 5 6 7 8 9 
		
		for( int i=1; suyel<bee_site_1 ; i++) {
			suyel += i;
			room=i;
		}
		if(	suyel == bee_site_1    && (bee_su-1)%6 > 0 ) {room+=1;}	
		System.out.println(room+1);
		sc.close();
		
	}
}
