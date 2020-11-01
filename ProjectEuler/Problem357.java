package ProjectEuler;

import java.util.ArrayList;

public class Problem357 {
	static int limit = 100000000;
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		ArrayList<Integer> comps = MyU.compsUpTo(limit+1);
		boolean[] numbs = new boolean[limit+1];
		numbs[1] = true;
		for(int i = 2; i<numbs.length; i+=4) {
			numbs[i] = true;
		}
		for(int i = 0; i<comps.size(); i++) {
			for(int j = 1; j<comps.get(i)/2.0 && j*(comps.get(i)-j)<=limit; j++) {
				numbs[j*(comps.get(i)-j)] = false;
			}
		}
		long sum = 0;
		int i = 1;
		if(numbs[i]) {
			sum+=i;
		}
		for(i = 2; i<=limit; i+=4) {
			if(numbs[i]) {
				sum+=i;
			}
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");	
	}
}
