package sub06;

public class _05 {
	public static void main(String[] args) {
	
	int[] value = {3,5,2,7,1};
	
	PrintArray(value);
	for(int i=4; i>0 ; i--) {
		for(int j=0;j<i;j++) {
			if(value[j] > value[j+1]) {
				int temp = value[j];
				value[j] = value [j+1];
				value[j+1] = temp;
				
			}
		}PrintArray(value);
	}
	
	}
	
	public static void PrintArray(int[] array) {
		for(int i : array)
			System.out.printf("%5d",i);
		
		System.out.println();
	}
}
