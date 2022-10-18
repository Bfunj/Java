package Step11;

import java.util.Scanner;

public class _02_2231 {
	public static void main(String[] args) {
		int[] num= new int[1000001];
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<num.length;i++) {
			num[i]=bunhae(i,i);
				if(num[i] == a) {
				System.out.println(i);
				break;
			}
			if(i==1000000) {
				System.out.println("0");
			}
			}
	}
	public static int bunhae(int su,int sum) {
		if(su/10==0) {
			return sum+=su%10;
		}
		else {
			sum += su%10;
			su=su/10;
		}
		return bunhae(su,sum);
	}
}
