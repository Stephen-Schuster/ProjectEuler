package ProjectEuler;

public class Problem34 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sum = 0;
		for(int i = 11; i<2540160;i++) {
			if(sumOfDigitsFacotrial(i)==i) {
				sum+=i;
			}
			System.out.println(i);
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int sumOfDigitsFacotrial(int num) {
		String s = Integer.toString(num);
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			sum+=factorial(Character.getNumericValue(s.charAt(i)));
		}
		return sum;
	}
	public static long factorial(int num) {
		int f = 1;
		for(int i = num; i>0; i--) {
			f*=i;
		}
		return f;
	}
}
