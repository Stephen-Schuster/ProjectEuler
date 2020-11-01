package ProjectEuler;

public class Problem {
	public static void main(String[] args) {
		long time = System.currentTimeMillis(); int ans = 0;
		for(int i = 9; true; i+=2) {
			if(!isPrime(i) && !fitsConjP46(i)) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean fitsConjP46(int num) {
		for(int i = 2; i<num; i++) {
			if(isPrime(i) && (Math.sqrt(((double)num-i)/2)) == (int)Math.sqrt(((double)num-i)/2)) {
				return true;
			}
		}
		return false;
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
