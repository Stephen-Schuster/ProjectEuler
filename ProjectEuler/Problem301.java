package ProjectEuler;

public class Problem301 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ct = 0;
		String[] s = new String[3];
		long bigNum = (long)Math.pow(2, 30);
		for(long i = 1; i<=bigNum; i++) {
			for(int j = 0; j<3; j++) {
				s[j] = Long.toBinaryString(i*(j+1));
			}
			int l = s[2].length();
			for(int j = 0; j<2; j++) {
				while(s[j].length()<l) s[j] = "0"+s[j];
			}
			boolean good = true;
			for(int j = 0; j<l; j++) {
				if((s[0].charAt(j)+s[1].charAt(j)+s[2].charAt(j))%2 != 0) {
					good = false;
					break;
				}
			}
			if(good) ct++;
		}
		System.out.println(ct);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
