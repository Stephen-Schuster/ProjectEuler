
public class Problem3 {
	public static long theNum = 600851475143L;
	public static long best = 0;
	public static long bestPrinted = -100;
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		doStuff(theNum);
		System.out.println(best);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
	public static void doStuff(long num) {
		boolean isPrime = true;
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if((double)num/i%1 == 0) {
				isPrime = false;
				doStuff(i);
				doStuff(num/i);
			}
		}
		if(isPrime && num>best) best = num;
	}
}
