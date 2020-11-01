package ProjectEuler;

import java.util.ArrayList;

public class Problem72 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println("Gimme a bit more than 2 mins");
		long n = 1000000, count = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		for(int i = 3; i<=n; i++) {
			if(MyU.isPrime(i)) primes.add(i);
		}
		for(int den = 2; den<=n; den++) {
			if(MyU.isPrime(den)) count+=den-1;
			else {
				int t = den-1;
				for(int i = 0; primes.get(i)<=den/2; i++) {
					if(den%primes.get(i) == 0) {
						t-=t/primes.get(i);
					}
				}
				count+=t;
			}
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
