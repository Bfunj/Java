package sub02;
/*
 * 
 * 2022.08.26
 * 백현조
 * 자바 배열 선택정렬 연습문제
 *  
 * 
 */
public class _04 {
	public static void main(String[] args) {
	
		int[] arr = {4,2,1,5,3};
		for(int i=0; i<4; i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i] > arr[j]) {
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i] =temp;
				}
			}
		}
		
		for(int k=0; k<5; k++) {
			System.out.print(arr[k]+" ");
		}
	}
}