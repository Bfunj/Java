package sub2;
/*
 * 
 * 2022.08.22
 * 백현조
 * java 다차원 배열
 * 
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		// 1차원 배열
		int[] scores = {80,60,78,62,92};
		int total =0;
		for(int i=0;  i<scores.length; i++)
		{ total += scores[i];}
		System.out.println("total 의 합은 "+total);
		
		
		
		//2차원 배열
		int[][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0; i<3;i++) {
		for(int arrr : arr2d[i])
		System.out.println("arrr[][]= "+arrr);
		}
		
		System.out.println(arr2d[0].length);
		
		//3차원 배열
		int [][][] arr3d = {	{   {1,2,3},
									{4,5,6},
									{7,8,9} },
								{ 	{10,11,12},
									{13,14,15},
									{16,17,18} },
								{	{19,20,21},
									{22,23,24},
									{25,26,27} } };
		for(int a=0 ;a<3;a++) {
			for(int b=0 ;b<3 ;b++) {
				for(int c=0;c<3;c++) {
		
		System.out.println("arr3d["+a+"]["+b+"]["+c+"] = "+arr3d[a][b][c]);
				}
			}
	}
}
}