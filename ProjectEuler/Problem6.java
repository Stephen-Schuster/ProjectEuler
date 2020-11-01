
public class Problem6 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sumOfSqrs = 100*(100+1)*(2*100+1)/6;
		int sqrOfSum = (int) Math.pow(100*(100+1)/2,2);
		System.out.println(sqrOfSum-sumOfSqrs);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
}
