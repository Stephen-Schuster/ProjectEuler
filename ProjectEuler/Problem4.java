
public class Problem4 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ans = 0;
		boolean done = false;
		for(int i = 999; i>99 && !done; i--) {
			int palindrome = Integer.parseInt(i+""+i%10+i%100/10+i/100);
			for(int j = 999; j>99; j--) {
				if((double)palindrome/j%1 == 0 && 1000 > (double)palindrome/j && (double)palindrome/j > 99) {
					ans = palindrome;
					done = true;
					break;
				}
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
}
