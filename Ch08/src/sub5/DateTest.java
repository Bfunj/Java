package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/*
 * 
 * 2022.09.07
 * 백현조
 * 
 */
public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 HH:MM:ss");
		String result = sdf.format(date);
		System.out.println("result : " + result);
		
		//Calendar 클래스
		Calendar cal = Calendar.getInstance();
		int yy=cal.get(Calendar.YEAR);
		int mm=cal.get(Calendar.MONTH)+1;
		int dd=cal.get(Calendar.DATE);
		int hh=cal.get(Calendar.HOUR);
		int m=cal.get(Calendar.MINUTE);
		int s=cal.get(Calendar.SECOND);

		System.out.printf("%d년 %d월 %d일 %d:%d:%d",yy,mm,dd,hh,m,s);
	}
}
