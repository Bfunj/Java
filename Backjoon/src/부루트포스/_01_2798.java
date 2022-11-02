package 부루트포스;



/*
 *  && max_num >= num[i]+num[j]+num[k]
 * 블랙잭
 */
import java.util.Scanner;
public class _01_2798 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int card_su =sc.nextInt();
		int max_num = sc.nextInt();
		int[] num=new int[card_su];
		int sum=0;
		for(int i=0; i<card_su;i++) {
			num[i] = sc.nextInt();
		}

		for(int i=0;i<card_su-2;i++) {
			for(int j=i+1;j<card_su-1;j++) {
				for(int k=j+1;k<card_su;k++) {
					//System.out.println("i :"+i+" j :"+j+" k :"+k);
					if(sum <= num[i]+num[j]+num[k] && max_num >= num[i]+num[j]+num[k]) {
						sum = num[i]+num[j]+num[k];
					}
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
