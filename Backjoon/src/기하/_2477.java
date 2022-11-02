package 기하;

import java.util.Scanner;

public class _2477 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int melon = sc.nextInt();
		int[] direct = new int[6];
		int[] distance = new int[6];
		
		int M_row =0;
		int M_col =0;
		int angle=0;
		int result=0;
		
		for(int i=0; i<6 ;i++) {
			direct[i]=sc.nextInt();
			distance[i]=sc.nextInt();
			
			if(direct[i] == 1 || direct[i] == 2 ) {
				if(distance[i] > M_row) {
					M_row=distance[i];
				}
			}
			if(direct[i] == 3 || direct[i] == 4 ) {
				if(distance[i] > M_col) {
					M_col=distance[i];
				}
			}
		}//for 종료
		int next = direct[0];
		boolean a= false;
		for(int i= 1;i<6;i++) {
			switch(next) {
				case 1 : next = 4;
						break;
				case 4 : next = 2;
						break;
				case 2 : next = 3;
						break;
				case 3 : next = 1;
						break;
			}
			if(next == direct[i]) {			
			}else{
				angle=i;
				a=true;
				break;
			}
		}
		if(a) {
		result = melon*((M_row * M_col)-(distance[angle]*distance[angle-1]));
		} else result = melon*((M_row * M_col)-(distance[0]*distance[5]));
		System.out.println(result);
		sc.close();
	}
}
