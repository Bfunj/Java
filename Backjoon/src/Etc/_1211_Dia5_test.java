package Etc;
/*
 * 
 * diamond-5
 * 1211 보일의법칙
 * 
 * 
 * 
 * 
1번째 1-9	1-81
2번째 11-19	11-171
3번째 21-29	42-522
4번째 31-39 	93-1053
5번쨰 41-49	164-1764
6번째 51-59	255-2655
7번째 61-69	366-3726

11번째 	101-109		0-0
12번째 	111-119		111-1071
13	121-129		242-2322
14	131-139		393-3753
15	141-149		564-5364	




n번째 (n-1)*10+1 - (n-1)*10+9	a-b

input A to B

A or B 포함된 영역 탐색


 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.StringTokenizer;


public class _1211_Dia5_test {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long Start_num = Long.parseLong(st.nextToken());
		long End_num = Long.parseLong(st.nextToken());
		
		ArrayList<Long> arr = new ArrayList<>(); 
		
		long num1_multi=1;
		int count=0;
		
		for(long start=Start_num;start<=End_num;start++) {
			long sqrt =  (long) Math.sqrt(start); 
			for(int i = 1; i <= sqrt; i++){
				if(start % i == 0){ // 약수 중 작은 수 저장
				arr.add((long) i);
				       if(start / i != i){ // 약수 중 큰 수 저장
				           arr.add (start / i);
				     }
				}
			}
			//arr.sort(Comparator.naturalOrder());
			int size= arr.size()/2;
			if(arr.size()%2==1) {size += 1;}
			for(int i=0;i<size;i++) {
				String Big_num = Long.toString(arr.get(i*2+1 >arr.size()-1 ? arr.size()-1 : i*2+1 ));
				Long Small_num = arr.get(i*2);
				
				for(int num1_su=0;num1_su<Big_num.length();num1_su++) {
					num1_multi = num1_multi*Character.getNumericValue(Big_num.charAt(num1_su));
				}		
				if(num1_multi == Small_num) {
					count ++;
					System.out.println(num1_multi);
				}
				num1_multi=1;
			}
			arr.clear();
			if(count >2) {
			System.out.println("count : "+count);
			System.out.println("start : "+start);
			}
			count=0;
		}
		System.out.println(count);	
	}
}
