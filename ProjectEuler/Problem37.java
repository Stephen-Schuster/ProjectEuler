package ProjectEuler;

public class Problem37 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sum = 0;
		int count = 0;
		for(int i = 11; count<11; i+=2) {
			if(isTruncatablePrimeDiv(i) && isTruncatablePrimeMod(i)) {
				count++;
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean isTruncatablePrimeDiv(int num) {
		if(num<10) {
			return isPrime(num);
		} else {
			return isPrime(num) && isTruncatablePrimeDiv(num/10);
		}
	}
	public static boolean isTruncatablePrimeMod(int num) {
		int length = Integer.toString(num).length();
		if(num<10) {
			return isPrime(num);
		} else {
			return isPrime(num) && isTruncatablePrimeMod((int) (num%Math.pow(10, length-1)));
		}
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
