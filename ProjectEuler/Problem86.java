package ProjectEuler;

public class Problem86 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int count = 2060, ans = 0;
		boolean found = false;
		for (int m = 101; !found; m++) {
			for (int i = 1; i <= m && !found; i++) {
				for (int j = 1; j <= i; j++) {
					if (Math.sqrt(m * m + (i + j) * (i + j)) % 1 == 0) {
						count++;
						if (count > 1000000) {
							found = true;
							ans = m;
							break;
						}
					}
				}
			}
		}
		System.out.println(ans);
		System.out.println((double) (System.currentTimeMillis() - time) / 1000 + " seconds");
	}
}
