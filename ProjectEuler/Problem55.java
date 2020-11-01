package ProjectEuler;

import java.math.BigInteger;

public class Problem55 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ans = 0;
		for(int i = 0; i<10000; i++) {
			if(isLychrel(i)) {
				ans++;
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean isLychrel(int num) {
		BigInteger n = new BigInteger(Integer.toString(num));
		for(int i = 0; i<=50; i++) {
			BigInteger nr = new BigInteger(reverse(n.toString()));
			n = n.add(nr);
			if(isPdrome(n.toString())) {
				return false;
			}
		}
		return true;
	}
	public static String reverse(String s) {
		String s2 = "";
		for(int i = s.length()-1; i>=0; i--) {
			s2 = s2 + s.charAt(i);
		}
		return s2;
	}
	public static boolean isPdrome(String num) {
		String s = num;
		int length = s.length();
		for(int i = 0; i<length/2; i++) {
			if(s.charAt(i) != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
}
