package Step04;

import java.util.Scanner;

public class _baek_5597 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] student=new int[31];
		int ct=0;
		for(int i=1;i<29;i++) {
			student[sc.nextInt()]++;
		}
		for(int i=1;i<31;i++) {
			if(student[i]==0 && ct<2) {
				System.out.println(i);
				ct++;
			}
		}
		sc.close();
	}
}
