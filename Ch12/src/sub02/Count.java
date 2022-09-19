package sub02;

import java.util.Set;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
	}
	public synchronized void setNum() { // 동기화블럭 : 스레드간 경합을 막고 동기방식으로 실행
		num++;
	}
}
