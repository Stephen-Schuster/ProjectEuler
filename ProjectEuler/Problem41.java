package ProjectEuler;

public class Problem41 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int best = 0;
		for(int j = 9; j>0; j--) {
			for(int i = 0; i<factorial(j); i++) {
				if(isPrime(Integer.parseInt(add1toAllDigits(sequence(i,j))))&&Integer.parseInt(add1toAllDigits(sequence(i,j)))>best) {
					best = Integer.parseInt(add1toAllDigits(sequence(i,j)));
				}
			}
		}
		System.out.println(best);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static String add1toAllDigits(String num) {
		String newS = "";
		for(int i = 0; i<num.length(); i++) {
			newS = newS + (Character.getNumericValue(num.charAt(i))+1);
		}
		return newS;
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
	public static long factorial(int num) {
		int f = 1;
		for(int i = num; i>0; i--) {
			f*=i;
		}
		return f;
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
