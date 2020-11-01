package ProjectEuler;

public class problem30 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sum = 0;
		for(int i = 11; i<354294; i++) {
			if(sumOfDigitsToTheFifith(i) == i) {
				sum+=i;
			}
			System.out.println(i);
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
	public static int sumOfDigitsToTheFifith(int num) {
		String s = Integer.toString(num);
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			sum+=Math.pow(Character.getNumericValue(s.charAt(i)),5);
		}
		return sum;
	}
}
