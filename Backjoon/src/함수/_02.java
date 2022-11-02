package 함수;
/*
 * 
 * 2022.05.28
 * 백현조
 * 셀프넘버
 * 
 */
import java.util.Scanner;

public class _02 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int s=1;
	int s_sum=0;
	
	int[] arry = new int[10000];
	
	for(int i=0; i<arry.length;i++) {
		s_sum = s+s%10+(s/10)%10+(s/100)%10+(s/1000)%10;
		if(s_sum<=10000) {
		arry[s_sum-1]=-1;
		}
		if(arry[i] >= 0) {
		arry[i]=i+1;
		System.out.println(arry[i]);
		}
		s++;
	}	
	sc.close();
	}
	
}

