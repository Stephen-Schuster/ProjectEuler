package ProjectEuler;

public class Problem69 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int prod = 1;
		for(int i = 2; prod<1000000; i++) {
			if(isPrime(i)) {
				prod*=i;
			}
			if(prod>1000000) {
				prod/=i;
				break;
			}
		}
		System.out.println(prod);
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
