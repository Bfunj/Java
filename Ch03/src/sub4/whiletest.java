package sub4;
/*
 * 
 * 2022.08.18
 * bhj
 * java while 반복문 실행하기
 * 
 */
public class whiletest {
	public static void main(String[] args) {
	
		//1부터 10까지 합
		int i=1,sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}System.out.println("1부터 10까지의 합 :"+sum);
		
		//do ~while
		int tot=0;
		int j=1;
		do {
			if(j%2 == 0)
				tot += j;
				j++;
		}
		while(j<=10);
		System.out.println("1부터 10까지 짝수의 합 : "+tot);

		//break
		
		int num=1;
		
		while(true) {
			
			if(num%5 == 0 && num %7 ==0) {
				break;
		}
		num++;
		}
		System.out.println("5와 7의 최소 공배수 :"+num);
		
		
		//continue
		
		int total=0;
		int jj=1;
		while(jj<=10) {
			jj++;
			if(jj%2==1) {
				continue;
			}
			total+=jj;
		}System.out.println("1부터 10까지 짝수 합 : "+total);
		
		int ssss =10;
		System.out.println(ssss);
		System.out.println(ssss--);
		System.out.println(-ssss);
		System.out.println(--ssss);
	}
}
