package sub03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 2022.09.13
 * 백현조
 * serialize 실습하기
 * 
 */
public class DESerializeTest2 {

		public static void main(String[] args) {
	
			String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
			
			try {
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				Apple a1 = (Apple) ois.readObject();
				Apple a2 = (Apple) ois.readObject();
			
				ois.close();
				fis.close();
				a1.show();
				a2.show();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("역직렬화 완료");
			
		}
}
