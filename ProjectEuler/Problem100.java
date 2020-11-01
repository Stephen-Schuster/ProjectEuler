package ProjectEuler;

import java.math.BigInteger;

public class Problem100 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long big = 100000000;
		long n1 = 1000000000000L;
		long untilNext = 432790347782L;
	    long n2 = 1414213562374L;
		while(true) {
			if(n1>untilNext) {
				untilNext+=n2;
				n2+=2;
			}
			untilNext-=n1;
			n1+=1;
			if(n1 == untilNext) {
				break;
			}
		}
		System.out.println((long)((n1+1)*(Math.sqrt(2)/2))+1);
		System.out.println((System.currentTimeMillis()-time)/1000.0+" seconds");
	}
}
