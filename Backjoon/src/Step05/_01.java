package Step05;
/*
 * 
 * 2022.05.28
 * 백현조
 * 셀프넘버
 * 
 */


class Test {
    long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}

