package ProjectEuler;

public class Problem71 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int bestNum = 0;
		@SuppressWarnings("unused")
		int bestDen = 0;
		double best = 100;
		for(double i = 1000000; i>999990; i--) {
			for(double j = (int)(2.0/7 * i)+1; j/i<3.0/7; j++) {
				if(3.0/7 - j/i < best && 3.0/7 - j/i > 0.000000001) {
					best = 3.0/7 - j/i;
					bestNum = (int) j;
					bestDen = (int) i;
				}
			}
		}
		System.out.println(bestNum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
