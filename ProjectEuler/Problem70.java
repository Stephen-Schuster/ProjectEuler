package ProjectEuler;

import java.util.ArrayList;

public class Problem70 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		double best = 10000000, besti = -10;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; i<=5000000; i+=2) {
			System.out.println(i);
			if(isPrime(i)) primes.add(i);
		}
		for(int i = 8000001; i<=10000000; i+=2) {
			System.out.println(i);
			if(isPrime(i)) primes.add(i);
		}
		System.out.println(primes.size());
		System.out.println(primes.indexOf(43684211));
		for(int i = 8000001; i<10000000; i+=2) {
			boolean good = true;
			for(int j = 1; primes.get(j)<2000; j++) {
				if(i%primes.get(j) == 0) {
					good = false;
					break;
				}
			}
			System.out.println(i);
			if(good) {
				if(!primes.contains(i)) {
					int tot = totient(i,primes);
					if(arePerms(i,tot)) {
						if((double)i/tot < best) {
							best = (double)i/tot; besti = i;
						}
					}
				}
			}
		}
		System.out.println(besti);
		System.out.println(best);
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
	public static int totient(int n, ArrayList<Integer> primes) {
		int n1 = n;
		for(int i = 0; n != 1; i++) {
			if((double)n%primes.get(i) == 0) {
				while((double)n%primes.get(i) == 0) {
					n/=primes.get(i);
				}
				n1*=(double)(primes.get(i)-1)/primes.get(i);
			}
		}
		return n1;
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
