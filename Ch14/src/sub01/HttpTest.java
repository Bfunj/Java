package sub01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 2022.09.21
 * 백현조
 * HTTP 통신 실습하기
 * 
 * HTTP 통신
 *  - TCP/IP 프로토콜을 이용한 단방향 통신
 *  - 일반적인 웹 프로그래밍은 HTTP 통신을 이용한다.
 */
public class HttpTest {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://google.com");
			BufferedReader br =new BufferedReader(new InputStreamReader(url.openStream()));
		
			String line =null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
		br.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
