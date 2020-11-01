package ProjectEuler;

import java.math.BigInteger;

public class Problem53 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int count = 0;
		BigInteger OneMil = new BigInteger("1000000");
		for(int n = 1; n<=100; n++) {
			for(int r = 1; r<=n; r++) {
				if((factorialB(n)).divide(factorialB(r).multiply(factorialB(n-r))).compareTo(OneMil) == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static BigInteger factorialB(int num) {
		BigInteger f = new BigInteger("1");
		for(int i = num; i>0; i--) {
			BigInteger Bi = new BigInteger(Integer.toString(i));
			f = f.multiply(Bi);
		}
		return f;
	}
}
