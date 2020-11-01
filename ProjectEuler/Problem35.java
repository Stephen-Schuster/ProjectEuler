package ProjectEuler;

public class Problem35 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int total = 1;
		int singleCP = 0;
		for(int i = 3; i<1000000; i+=2) {
			if(isCircularPrimeLength(i)) { total++; singleCP = i; }
			System.out.println(i);
		}
		System.out.println(total);
		System.out.println(singleCP);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean isCircularPrimeLength(int num) {
		String s = Integer.toString(num);
		int length = s.length();
		for(int i = 0; i<length;i++) {
			String testS = "";
			for(int j = 0; j<length; j++) {
				testS = testS + s.charAt((j+i)%length);
			}
			if(!isPrime(Integer.parseInt(testS))) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(int num) {
		for(double i = 2.0; i<=Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				return false;
			}
		}
		return true;
	}
}
