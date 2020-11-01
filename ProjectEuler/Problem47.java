package ProjectEuler;

import java.util.ArrayList;

public class Problem47 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis(); 
		int ans = 0;
		boolean notFound = true;
		for(int i = 644; notFound; i++) {
			System.out.println(i);
			boolean found = true;
			for(int j = 0; j<4; j++) {
				if(!(numOfDistPFactors(i+j)>3)) {
					found  = false;
					ans = i;
					break;
				}
			}
			notFound = !found;
		}
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int numOfDistPFactors(int num) {
		int count = 1;
		ArrayList<Integer> pFactors = new ArrayList<Integer>();
		while(!isPrime(num)) {
			for(int i = 2; i<num; i++) {
				if(isPrime(i) && (double)num/i%1 == 0) {
					num /= i;
					if(!pFactors.contains(i)) {
						pFactors.add(i);
						count++;
					}
				}
			}
		}
		if(num == 1 || pFactors.contains(num)) {
			count--;
		}
		return count;
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
