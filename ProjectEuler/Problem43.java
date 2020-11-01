package ProjectEuler;

public class Problem43 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long sum = 0;
		for(int i = 0; i<factorial(10); i++) {
			if(hasProperty(i)) {
				sum+=Long.parseLong(sequence(i,10));
			}
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean hasProperty(int i) {
		int[] primes = {2,3,5,7,11,13,17};
		for(int j = 0; j<primes.length; j++) {
			if(Integer.parseInt(sequence(i,10).substring(1+j, 4+j))%primes[j] != 0) {
				return false;
			}
		}
		return true;
	}
	public static long factorial(int num) {
		int f = 1;
		for(int i = num; i>0; i--) {
			f*=i;
		}
		return f;
	}
	public static String sequence(int num, int l) {
		String s = "0";
		int[] arr = new int[l];
		for(int i = 0; i<l; i++) {
			arr[i] = i;
		}
		for(int i = l; i>0; i--) {
			int r = (int) (num%factorial(i)/(factorial(i-1)));
			s = s+arr[r];
			for(int j = r; j<l-1; j++) {
				arr[j] = arr[j+1];
			}
		}
		return s.substring(1,s.length());
	}
}
