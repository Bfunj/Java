package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1002 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(bf.readLine());
		int[] axis= new int[6];
		
		for(int i =0 ;i<N;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0;j<6 ;j++) {
				axis[j]=Integer.parseInt(st.nextToken());
			}
			System.out.println(Axis(axis)); 
		}
	}
	
	static int Axis(int[] axis) {
		
		int x1= axis[0];
		int x2= axis[3];
		int y1= axis[1];
		int y2= axis[4];
		int r1= axis[2];
		int r2= axis[5];
		
		double x1_x2_Reach =Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
		
		if(x1 == x2 && y1 ==y2 && r1==r2) {
			return -1;
		}
		
		if(x1_x2_Reach > r1+r2) {
			return 0;
		}
		if(x1_x2_Reach == r1+r2) {
			return 1;
		}
		if(r1<r2) {
			if(x1_x2_Reach + r1 ==r2) {
				return 1;
			}
		}else {
			if(x1_x2_Reach + r2 ==r1) {
				return 1;
			}
		}
		if(x1_x2_Reach < r1+r2) {
			return 2;
		}	
		return 3;
	}
}
