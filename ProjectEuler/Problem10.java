import java.util.ArrayList;


public class Problem10 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long twoMillion = 2000000;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		long sum = 2;
		for(int i = 3; i<twoMillion; i+=2) {
			int sqrt = (int)Math.sqrt(i);
			boolean isPrime = true;
			for(int j = 0; j<primes.size(); j++) {
				if(primes.get(j) <= sqrt) {
					if((double)i/primes.get(j)%1 == 0)  {
						isPrime = false;
						break;
					}
				} else break;
			}
			if(isPrime) {
				primes.add(i);
				sum+=i;
			}
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
}
