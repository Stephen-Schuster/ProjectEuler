package ProjectEuler;

public class Problem112 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int bouncy = (int) (21780*0.9);
		int nonB = (int)(21780*0.1);
		int ans  = 0;
		boolean found = false;
		for(int i = 21781; !found; i++) {
			if(i%100 == 0) {
				if(MyU.isBouncy(i)) bouncy++;
				else nonB++;
				if(nonB*99 == bouncy) {
					found = true;
					ans = i;
				}
			} else {
				if(MyU.isBouncy(i)) bouncy++;
				else nonB++;
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
