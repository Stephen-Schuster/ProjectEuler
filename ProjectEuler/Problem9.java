
public class Problem9 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ans = 0;
		for(int a = 1; a<333; a++) {
			if((a*a + Math.pow(1000-a,2))%(2*(1000-a)) == 0) {
				int c = (int)((a*a + Math.pow(1000-a,2))/(2*(1000-a)));
				ans = a * (1000-a-c) * c;
				break;
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
}
