package Ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 2022.08.21
 * 
 * BufferedRead 이해하기
 * BufferdWriter 이해하기
 * Tokenizer 이해하기
 * split 이해하기
 * 
 */
public class BufferedReder_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)); // bufferedReader 선언
		String s = bf.readLine(); //String 문자열을 입력 받음
		//int i = Integer.parseInt(bf.readLine()); // 숫자를 입력 받아서 인트형으로 형변환
		String[] tokens=s.split(" "); // s 에 입력받은 문자열들을 " " 나올때마다 tokens배열안에 문자열 하나하나씩 저장
		for(int i=0;i<tokens.length;i++){
			System.out.println(tokens[i]);
		}
		}
}

