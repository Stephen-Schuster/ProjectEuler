package ProjectEuler;

import java.util.ArrayList;

public class Problem73 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		ArrayList<Double> arr = new ArrayList<Double>();
		int count = 0;
		for(int i = 2; i<=12000; i++) {
			if(i%100 == 0) System.out.println(i);
			for(int j = i/3+1; j<(double)i/2; j++) {
				if(MyU.gcd(i, j) == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
