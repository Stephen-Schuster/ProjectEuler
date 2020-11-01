package ProjectEuler;

public class Problem64 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int count  = 0;
		for(int i = 2; i<=10000; i++) {
			if(Math.sqrt(i)%1 != 0 ) {
				int m = 0, m1 = 0;
				int d = 1, d1 = 0;
				int a = (int) Math.sqrt(i), a1 = 0;
				int num = 0;
				while(true) {
					m1 = d*a - m;
					d1 = (i - m1 * m1)/d;
					a1 = (int) ((Math.sqrt(i) + m1)/d1);
					a = a1; m = m1; d = d1;
					num++;
					if(a == 2*(int) Math.sqrt(i)) {
						break;
					}
				}
				if(num%2 == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
