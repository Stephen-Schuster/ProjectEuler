package ProjectEuler;

import java.util.ArrayList;

public class Problem49 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int hits = 0;
		boolean found = false;
		String ans = "";
		for(int i = 1; i<5000; i++) {
			for(int j = 1001; j<9999-(2*i); j+=2) {
				if(arePerms(j,j+i) && arePerms(j,j+2*i) && isPrime(j) && isPrime(j+i) && isPrime(j+i*2) ) {
					if(hits>0) {
						found = true;
						ans = j+""+(i+j)+(i*2+j);
						break;
					}
					hits++;
				}
			}
			if(found) {
				break;
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean arePerms(int num1, int num2) {
		ArrayList<Character> digs1 = new ArrayList<Character>();
		ArrayList<Character> digs2 = new ArrayList<Character>();
		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i = 0; i<s1.length(); i++) {
			digs1.add(s1.charAt(i));
		}
		for(int i = 0; i<s2.length(); i++) {
			digs2.add(s2.charAt(i));
		}
		for(int i = 0; i<s1.length(); i++) {
			if(digs2.contains(digs1.get(i))) {
				digs2.remove(digs2.indexOf(digs1.get(i)));
			} else {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(double i = 2.0; i<=Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				return false;
			}
		}
		return true;
	}
}
