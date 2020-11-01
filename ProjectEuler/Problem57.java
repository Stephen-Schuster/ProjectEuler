package ProjectEuler;

import java.math.BigInteger;

public class Problem57 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			BigInteger num = new BigInteger("1");
			BigInteger den = new BigInteger("2");
			BigInteger two = new BigInteger("2");
			BigInteger t = new BigInteger("0");
			for (int j = 0; j <= i; j++) {
				num = num.add(two.multiply(den));
				t = den;
				den = num;
				num = t;
			}
			num = num.add(den);
			if (num.toString().length() != den.toString().length()) {
				count++;
			}
		}

		System.out.println(count);
		System.out.println((double) (System.currentTimeMillis() - time) / 1000 + " seconds");
	}
}
