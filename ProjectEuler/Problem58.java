package ProjectEuler;

public class Problem58 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int total = 1, count = 0, i = 3;
		for(i = 3; true; i+=2) {
			for(int j = 0; j<4; j++) {
				total++;
				if(isPrime(i*i-(i-1)*j)) {
					count++;
				}
			}
			if((double)count/total<0.1) {
				break;
			}
		}
		System.out.println(i);
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
