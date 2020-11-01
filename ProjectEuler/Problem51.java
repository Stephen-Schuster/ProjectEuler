package ProjectEuler;

public class Problem51 {
	public static void main(String[] args) {
		int x = 56004;
		while(true) {
			if(inFirstOfEight(x)) {
				break;
			}
			x++;
			System.out.println(x);
		}
		System.out.println(x + "!!!!");
	}
	public static boolean inFirstOfEight(int num) {
		if(hasDigit(num,0)) {
			int misses = 0;
			for(int i = 0; i<10; i++) {
				if(!isPrime(replaceDigit(num, 0, i))) {
					misses++;
				}
			}
			if(misses<=2) {
				return true;
			}
		}
		if(hasDigit(num,1)) {
			int misses = 1;
			for(int i = 1; i<10; i++) {
				if(!isPrime(replaceDigit(num, 1, i))) {
					misses++;
				}
			}
			if(misses<=2) {
				return true;
			}
		}if(hasDigit(num,2)) {
			int misses = 2;
			for(int i = 2; i<10; i++) {
				if(!isPrime(replaceDigit(num, 2, i))) {
					misses++;
				}
			}
			if(misses<=2) {
				return true;
			}
		}
		return false;
	}
	public static int replaceDigit(int num, int dig, int newDig) {
		String s = Integer.toString(num);
		for(int i = 0; i<s.length(); i++) {
			if(Character.getNumericValue(s.charAt(i)) == dig) {
				if(i == 0) {
					s = newDig + "" + s.substring(1,s.length());
				} else if(i == s.length()-1) {
					s = s.substring(0,s.length()-1)+""+newDig;
				} else {
					s = s.substring(0,i) + "" + newDig + s.substring(i+1,s.length());;
				}
			}
		}
		return Integer.parseInt(s);
	}
	public static boolean hasDigit(int num, int dig) {
		for(int i = 0; i<Integer.toString(num).length(); i++) {
			if(Character.getNumericValue(Integer.toString(num).charAt(i)) == dig) {
				return true;
			}
		}
		return false;
	}
	public static boolean isPrime(int num) {
		for(double i = 3.0; i<=Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				return false;
			}
		}
		return true;
	}
}
