package ProjectEuler;

public class Problem38 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int best = 918273645;
		for(int i = 9000; i<10000; i++) {
			if(isPandigital1to9(i+""+2*i)&&Integer.parseInt(i+""+2*i)>best) {
				best = Integer.parseInt(i+""+2*i);
			}
		}
		System.out.println(best);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean isPandigital1to9(String s) {
		for(int i = 0; i<s.length(); i++) {
			int hits = 0;
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(j) == s.charAt(i)) {
					hits++;
				}
				if(s.charAt(i) == '0'|| s.charAt(j) == '0') {
					return false;
				}
				if(hits>1) {
					return false;
				}
			}
		}
		return true;
	}
}
