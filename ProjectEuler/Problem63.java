package ProjectEuler;

import java.math.BigInteger;

public class Problem63 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		BigInteger ten = new BigInteger("10");
		BigInteger one = new BigInteger("1");
		int count = 0;
		for(BigInteger i = new BigInteger("1"); i.compareTo(ten) == -1; i = i.add(one)) {
			boolean started = false, finished = false;
			for(int j = 1; !started || !finished; j++) {
				if(i.pow(j).toString().length() == j) {
					started = true;
					count++;
				} else {
					if(started) {
						finished = true;
					}
				}
			}
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}

}
