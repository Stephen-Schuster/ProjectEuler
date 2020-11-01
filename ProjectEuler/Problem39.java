package ProjectEuler;

public class Problem39 {
	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		int best = 0;
		int bestCount = 0;
		for(int p = 12; p<=1000; p++) {
			int count = 0;
			for(int f = 3; f+2<p; f++) {
				int sec = findSecondSide(f,p);
				if(sec != 0) {
					if(Math.pow(f, 2)+Math.pow(sec,2) == Math.pow(p-f-sec, 2)) {
						count++;
					}
				}
			}
			if(count>bestCount) {
				best = p;
				bestCount = count;
			}
		}
		System.out.println(best);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int findSecondSide(int first, int per) {
		int upperB = per - first;
		int underB = 0;
		while(upperB-underB>1) {
			int second = (int) avg(upperB,underB);
			if(first*first + second*second == Math.pow(per-second-first, 2)) {
				return second;
			} else if(first*first + second*second < Math.pow(per-second-first, 2)) {
				underB = second;
			} else {
				upperB = second;
			}
		}
		return 0;
	}
	public static double avg(int num1, int num2) {
		return (num1+num2)/2.0;
	}
}
