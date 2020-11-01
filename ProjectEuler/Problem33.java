package ProjectEuler;

public class Problem33 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int prodD = 1;
		int prodN = 1;
		int[] goodD = new int[4];
		int[] goodN = new int[4];
		int count = 0;
		for(int denom = 11; denom<100; denom++) {
			for(int numer = 10; numer<denom; numer++) {
				if(digitsCancelWell(numer,denom)) {
					if((double)nOfCancelledDigits(numer,denom)/dOfCancelledDigits(numer,denom) == (double)numer/denom) {
						prodN *= nOfCancelledDigits(numer, denom);
						prodD *= dOfCancelledDigits(numer, denom);
						goodN[count] = numer;
						goodD[count] = denom;
						count++;
					}
				}
				System.out.println(numer+" "+denom);
			}
		}
		for(int i = 0; i<4; i++) {
			System.out.println(goodN[i]+","+goodD[i]);
		}
		System.out.println(dOfSimplifiedDigits(prodN,prodD));
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int dOfSimplifiedDigits(int num, int den) {
		return den/gcd(num,den);
	}
	public static int nOfSimplifiedDigits(int num, int den) {
		return num/gcd(num,den);
	}
	public static int gcd(int num1, int num2) {
		int best = 1;
		for(int i = 1; i<=num1; i++) {
			if((double)num1%i == 0 && (double)num2%i == 0) {
				best = i;
			}
		}
		return best;
	}
	public static int dOfCancelledDigits(int num, int den) {
		if(num%10 == den%10 || num/10 == den%10) {
			return den/10;
		}
		if(num%10 == den/10 || num/10 == den/10) {
			return den%10;
		}
		return den;
	}
	public static int nOfCancelledDigits(int num, int den) {
		if(num%10 == den%10 || num%10 == den/10) {
			return num/10;
		}
		if(num/10 == den%10 || num/10 == den/10) {
			return num%10;
		}
		return num;
	}
	public static boolean digitsCancelWell(int num, int den) {
		if(num%10==0||den%10==0) {
			return false;
		}
		int hits = 0;
		if(num%10 == den%10) {
			hits++;
		}
		if(num/10 == den%10) {
			hits+=5;
		}
		if(num%10 == den/10) {
			hits+=5;
		}
		if(num/10 == den/10) {
			hits++;
		}
		return(hits == 1 || hits == 6 || hits == 5);
	}
}