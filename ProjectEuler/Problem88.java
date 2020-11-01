package ProjectEuler;

import java.util.ArrayList;

public class Problem88 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		long[] timeCheck = {System.currentTimeMillis()};
		boolean[] tooLong = {false};
		int limit = 12000;
		int[] Ks = new int[limit+1]; //this will have all of the minimal product sum numbers for 2 <= k <= 12000
		int[] ct = new int[1]; //this variable lets us keep track of how many Ks we have found, its an array that's 1 long so that it's not a primitive
		for(int i = 4; ct[0]<limit-1; i++) { // i represents product sum numbers
			if(!MyU.isPrime(i)) {
				ArrayList<Integer> factors = MyU.pFactors(i);
				ArrayList<Integer> factorsCopy = MyU.copy(factors);+
				forLoops88(factors, factorsCopy, Ks, i, ct, timeCheck, tooLong);
				tooLong[0] = false;
				timeCheck[0] = System.currentTimeMillis();
			}
		}
		ArrayList<Integer> numsCounted = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 2; i<Ks.length; i++) {
			if(!numsCounted.contains(Ks[i])) {
				sum+=Ks[i];
				numsCounted.add(Ks[i]);
			}
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static void forLoops88(ArrayList<Integer> factors, ArrayList<Integer> factorsCopy, int[] Ks, int prod, int[] ct, long[] timeCheck, boolean[] tooLong) {
		if(!tooLong[0]) {
			int sum = 0;
			for(int i = 0; i<factorsCopy.size(); i++) {
				sum+=factorsCopy.get(i);
			}
			int k = factorsCopy.size()+(prod-sum);
			if(k<=12000) {
				if(Ks[k] == 0) {
					Ks[k] = prod;
					ct[0]++;
					timeCheck[0] = System.currentTimeMillis();
				}
			}
		}
		if(factors.size()>2) {
			for(int i = 0; i<factorsCopy.size()-1 && !tooLong[0]; i=seekNextDist(factorsCopy, i)) {
				for(int j = i+1; j<factorsCopy.size() && !tooLong[0]; j=seekNextDist(factorsCopy, j)) {
					if(System.currentTimeMillis()-timeCheck[0]>1500 || ct[0]>=11999) tooLong[0] = true;
					int m1 = factorsCopy.get(i), m2 = factorsCopy.get(j);
					factorsCopy.remove(factorsCopy.indexOf(m1));
					factorsCopy.remove(factorsCopy.indexOf(m2));
					factorsCopy.add(m1*m2);
					forLoops88(factorsCopy, MyU.copy(factorsCopy), Ks, prod, ct, timeCheck, tooLong);
					factorsCopy = MyU.copy(factors);
				}
			}
		}
	}
	public static int seekNextDist(ArrayList<Integer> arr, int i) {
		try {
			for(int bad = arr.get(i); arr.get(i) == bad; i++) {
			}
		} catch(IndexOutOfBoundsException e) {
			return arr.size();
		}
		return i;
	}
}
