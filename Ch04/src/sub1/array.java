package sub1;
/*
 * 
 * 2022.08.22
 * 백현조
 * java 배열 실습하기
 * 
 * 배열(Array)
 * - 하나이상의 데이터를 하나의 변수에 저장할 수 있는 자료구조
 * - 현대 프로그래밍에서는 배열 대신 리스트(LIST)를 더 많이 사용
 *
 *
 */
public class array {
public static void main(String[] args) {
	
	//배열
	int[] arr = {1,2,3,4,5};
	char[] arr2 = {'A','b','c'};
	String[] arr3 = {"서울","대전","대구","부산"};

	//배열 원소 출력
	System.out.println("arr[0] = "+ arr[0]);
	System.out.println("arr[1] = "+ arr[1]);
	System.out.println("arr[2] = "+ arr[2]);
	System.out.println("arr2[0] = "+ arr2[0]);
	System.out.println("arr2[1] = "+ arr2[1]);
	System.out.println("arr2[2] = "+ arr2[2]);
	System.out.println("arr3[1] = "+ arr3[1]);
	System.out.println("arr3[2] = "+ arr3[2]);
	System.out.println("arr3[3] = "+ arr3[3]);
	
	//배열 길이
	System.out.println("arr 배열 길이 ="+arr.length);
	System.out.println("arr2 배열 길이 ="+arr2.length);
	System.out.println("arr3 배열 길이 ="+arr3.length);
	
	//배열 반복문
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]);}
	System.out.println();
	for(char c : arr2) {
	System.out.print("c="+c);}
	System.out.println();
	for(String alal : arr3) {
	System.out.print(" "+alal);}
	System.out.println();
	
}
}
