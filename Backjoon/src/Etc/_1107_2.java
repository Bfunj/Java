package Etc;

/*
 move_ch : 이동할 채널(String)
dont_bt.length : 고장난 버튼의 수(String)
dont_bt[] : 고장난 버튼의 배열(String)

1. 고장난 수랑 같은가?

1.1 같으면 
비교하는 숫자에 +1, -1 이후 1번 시작

1.2 없으면 숫자 저장


 */
import java.util.Scanner;

public class _1107_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// input
		String Move_ch = sc.next();
		char[] DontButton = new char[sc.nextInt()];
		for(int i=0;i<DontButton.length;i++) {
			DontButton[i] = sc.next().charAt(0);
			}
		//input 종료
		
		String Start_ch="100"; // 현재 채널
		char[] Move_ch_C = new char[Move_ch.length()]; // 문자열을 문자로 변환
		for(int i = 0; i<Move_ch.length();i++) {
			Move_ch_C[i]=Move_ch.charAt(i);
		}
		
	
		sc.close();
	}
	
	public static void comp(String M_ch, int[] donbt) {
		
	}
	
	
	
}
