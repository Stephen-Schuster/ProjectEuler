

public class Problem2 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int last = 1;
		long sum = 0;
		int i = 2; 
		while(i<=4000000) {
			sum+=i;
			int tempi = i;
			i = 3*i + 2*last;
			last = 2*tempi + last;
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
}
