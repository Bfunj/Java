package 기본수학1;



/*
 * 
 * 2022.08.29
 * 백현조
 * 달팽이는 올라가고 싶다.
 * 높이 V미터
 * 낮에 A만큼 올라감
 * 밤에 B만큼 미끄러짐
 * 몇일 만에 올라갈까?
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _04_2869 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine()); // 입력받은 버퍼가 tokenizer st에 저장
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		int v= Integer.parseInt(st.nextToken());
		
		int df=(v-a)/(a-b);
		int df_=(v-a)%(a-b);
		if(df_>0)df+=1;
		
		int day=df+1;
		bw.write(day+"\n");
		bw.close();
	}
}
/*
		for(int i=1; ;i++) {
			v=v-a;
			if(v<=0) {
				day=i;
			break;}
			v=v+b;
		}*/