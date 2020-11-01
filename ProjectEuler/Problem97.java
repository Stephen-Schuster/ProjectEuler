package ProjectEuler;

import java.math.BigInteger;

public class Problem97 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		BigInteger two = new BigInteger("2");
		BigInteger m = new BigInteger("100000000000");
		BigInteger exp = new BigInteger("7830457");
		BigInteger big = new BigInteger("28433");
		two = two.modPow(exp, m);
		two = two.multiply(big);
		String s = two.toString();
		System.out.println(s.substring(s.length()-10, s.length()-1));
		System.out.println((double) (System.currentTimeMillis() - time) / 1000 + " seconds");
	}
}
