package ProjectEuler;

import java.util.ArrayList;

public class Problem76 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int number = 100, last = 0, count = 0;
		a.add(number);
		for(count = 0; a.get(0) > 1; count++) {
			if(a.get(0)!=last) {
				System.out.println(a.get(0));
			}
			last = a.get(0);
			int ind = 0;
			for(int i = a.size()-1; i>=0; i--) {
				if(a.get(i) != 1) {
					ind = i;
					break;
				}
			}
			int total = number;
			for(int i = 0; i<ind; i++) {
				b.add(a.get(i));
				total-=a.get(i);
			}
			b.add(a.get(ind)-1);
			total-=a.get(ind)-1;
			for(int i = a.get(ind)-1; total>0; i--) {
				while(total-i>=0) {
					total-=i;
					b.add(i);
				}
			}
			a.clear();
			a.addAll(b);
			b.clear();
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
