package ProjectEuler;

import java.math.BigInteger;

public class Problem66 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		BigInteger bestx = BigInteger.ZERO;
		BigInteger bestd = BigInteger.ZERO;
		for(int D = 2; D<=1000; D++) {
			if(Math.sqrt(D)%1 != 0) {
				BigInteger BD = new BigInteger(Integer.toString(D));
				for(BigInteger i = BigInteger.ZERO; true; i=i.add(BigInteger.ONE)) {
					String frac = MyU.contFracSqrt(BD,i);
					BigInteger num = new BigInteger(frac.substring(0, frac.indexOf("/")));
					BigInteger den = new BigInteger(frac.substring(frac.indexOf("/")+1));
					if(num.multiply(num).subtract(den.multiply(den.multiply(BD))).equals(BigInteger.ONE)) {
						if(num.compareTo(bestx) == 1) {
							bestx = num;
							bestd = BD;
						}
						break;
					}
				}
			}
		}
		System.out.println(bestd);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
