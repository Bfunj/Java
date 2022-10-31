package Step11;

import java.util.Scanner;

class people{
	private int weight;
	private int height;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void spec(int weight, int height) {
		this.height=height;
		this.weight=weight;
	}
}
public class _03_7568 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		people[] arry = new people[n];
		/*
		for(int i=0 ; i<n;i++) {
			arry[i].setWeight(sc.nextInt());
			arry[i].setHeight(sc.nextInt());
		}*/
		arry[0].setHeight(5);
		arry[0].setWeight(10);
		System.out.println(arry[0].getHeight());
		System.out.println(arry[0].getWeight());
		
	}
}
