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
		
		int x2 = 0;
		int x1 = 0;
		int y2 = 0;
		int y1 = 0;
		int r2 = 0;
		int r1 = 0;
		
		if(axis[2]>axis[5]) {
			x2= axis[0];
			x1= axis[3];
			y2= axis[1];
			y1= axis[4];
			r2= axis[2];
			r1= axis[5];
		}
		if(axis[5]>=axis[2]) {
			x1= axis[0];
			x2= axis[3];
			y1= axis[1];
			y2= axis[4];
			r1= axis[2];
			r2= axis[5];			
		}
						
		double d =Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
		// 교점이 3개이상인 경우 -- ok
		if(x1 == x2 && y1 ==y2 && r1==r2) {
			return -1;
		}
		
		//교점이 없는 경우
		//외부
		if(d > r1+r2) {
			return 0;
		}
		//내부
		if(d < r2-r1) {
			return 0;
		}
		if(x1 == x2 && y1 ==y2 && r1 !=r2) {
			return 0;
		}
		
		// 교점이 하나인 경우
		//외접
		if(d == r1+r2) {
			return 1;
		}
		//내접
		if(d == r2-r1) {
			return 1;
		}
		
		// 교점이 두개인 경우
		if(d < r1+r2 && d>r2-r1) {
			return 2;
		}	
		
		return 3;
	}
}
