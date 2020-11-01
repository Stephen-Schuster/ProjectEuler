package ProjectEuler;

public class Problem50 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sum = 0;
		int best = 0;
		int bestSum = 0;
		for(int i = 2; i<8; i++) {
			sum = 0;
			for(int j = i+1; sum<1000000; j++) {
				if(!isPrime(i)) {
					break;
				}
				if(isPrime(j)) {
					int count = 0;
					sum = 0;
					for(int k = i; k<=j; k++) {
						if(isPrime(k)) {
							sum+=k;
							count++;
						}
					}
					if(isPrime(sum) && count>best && sum<1000000) {
						best = count;
						bestSum = sum;
					}
				}
			}
		}
		System.out.println(bestSum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
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
