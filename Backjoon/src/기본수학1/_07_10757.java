package 기본수학1;



/*
 * 
 * 2022.08.31
 * 백현조
 * 
 * 큰수 A+B;
 * 
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _07_10757 {
	public static void main(String[] args)  throws IOException {
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		BigInteger big_int_A = new BigInteger(st.nextToken());
		BigInteger big_int_B = new BigInteger(st.nextToken());

		big_int_A=big_int_A.add(big_int_B);
		System.out.println(big_int_A.toString());
	}
}