package ProjectEuler;

import java.math.BigInteger;

public class Problem48 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis(); 
		BigInteger mod = new BigInteger("10000000000");
		BigInteger sum = new BigInteger("0");
		for(int i = 1; i<1001; i++) {
			BigInteger Bi = new BigInteger(Integer.toString(i));
			sum = Bi.modPow(Bi,mod).add(sum);
		}
		System.out.println(sum.longValue());
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
