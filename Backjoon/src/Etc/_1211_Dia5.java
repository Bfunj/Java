package Etc;
/*
 * 
 * diamond-5
 * 1211 보일의법칙
 * 
 * 
 * 
 * 
1번째 1-9	1-81
2번째 11-19	11-171
3번째 21-29	42-522
4번째 31-39 	93-1053
5번쨰 41-49	164-1764
6번째 51-59	255-2655
7번째 61-69	366-3726

11번째 	101-109		0-0
12번째 	111-119		111-1071
13	121-129		242-2322
14	131-139		393-3753
15	141-149		564-5364	




n번째 (n-1)*10+1 - (n-1)*10+9	a-b

input A to B

A or B 포함된 영역 탐색


 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;


public class _1211_Dia5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("약수를 구할 숫자를 입력해 주세요.");
        int num = sc.nextInt();
        
        System.out.println(divisor(num));
    }

    public static String divisor(int num)
    {
        if(num < 1)
            return "1이상의 값을 입력하세요.";
        
        String result = num + "의 약수 : ";
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                result += i+" ";
        }
        return result;
    }
	
			
}
