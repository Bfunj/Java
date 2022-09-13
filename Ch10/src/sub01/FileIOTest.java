package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2022.09.13
 * 백현조
 * 파일 입출력 스트림 실습하기
 * 
 * 파일 입출력(I/O)
 * - 파일은 컴퓨터 저장매체에 저장되는 데이터 묶음
 * - 프로그램은 데이터 처리와 함께 저장하기위해 파일 입출력을 수행
 * - 파일 입출력을 위해 스트림을 연결해야 됨
 * 
 */
public class FileIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Sample1.txt";
		String target = "C:\\Users\\java1\\Desktop\\Sample2.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			while(true) {
				int value = fis.read();
				
				if(value == -1) {// 파일을 모두 다 읽음
					break;
				}
				//char c= (char) value;
				//System.out.print(c);
				
				fos.write(value);
				
			}//while end
			
			fis.close();//스트림 해제
			fos.close();
			
			System.out.println("쓰기완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}//main end
}// class end
