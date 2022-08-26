package Step06;



/*
 * 
 * 2022.08.26
 * 백현조
 * 10809번 문제
 * 알파벳이 맨처음 나오는 위치 
 * 
 */
import java.util.Scanner;
public class _03_10809 {
	
public static void main(String[] args) {
	
	char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	Scanner sc = new Scanner(System.in);
	String word = sc.next();
	int[] word_int = new int[alpha.length];	
	for(int k=0; k<alpha.length ;k++) {
		word_int[k]=-1;
	}
	for(int i=0; i<word.length();i++) {
		for(int k=0; k<alpha.length ;k++) {
			
			if( alpha[k] == (word.substring(i,i+1)).charAt(0) ) {
				if( word_int[k]==-1) {
				word_int[k] = i;}
			}		
		}
	}
	for(int i=0; i<alpha.length;i++) {
		System.out.print(word_int[i]+" ");
	}
	sc.close();
}
}
