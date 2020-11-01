
public class Problem7 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int[] primes = new int[10001];
		int primesFound = 1;
		primes[0] = 2;
		for(int i = 3; primesFound<10001; i+=2) {
			int sqrt = (int)Math.sqrt(i);
			boolean isPrime = true;
			for(int j = 0; j<primesFound && primes[j] <= sqrt; j++) {
				if((double)i/primes[j]%1 == 0)  {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primes[primesFound] = i;
				primesFound++;
			}
		}
		System.out.println(primes[10000]);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
}
