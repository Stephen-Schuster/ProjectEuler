package ProjectEuler;

import java.math.BigInteger;

public class Problem65 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		BigInteger num = new BigInteger("1"), den = new BigInteger("1"), n = new BigInteger("0"), t = new BigInteger("0"), two = new BigInteger("2"), three = new BigInteger("3");
		int count = 1, sum = 0;
		for(count = 99; count>1; count--) {
			if(count%3 == 0) {
				BigInteger c = new BigInteger(Long.toString(count));
				n = two.multiply(c).divide(three);
			} else {
				n = BigInteger.ONE;
			}
			num=num.add(n.multiply(den));
			t = num;
			num = den;
			den = t;
		}
		num= num.add(two.multiply(den));
		String s = num.toString();
		for(int i = 0; i<s.length(); i++) {
			sum+=Character.getNumericValue(s.charAt(i));
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
