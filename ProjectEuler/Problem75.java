package ProjectEuler;

public class Problem75 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int num = 1500000;
		int count = 0;
		int[] nums = new int[num+1];
		for(int m = 2; 2*m*m +2*m<=num; m++) {
			for(int n = 1; n<m && 2*(m*m +m*n)<=num; n++) {
				if(m%2 != n%2 && MyU.gcd(n, m) == 1) {
					for(int k = 1; 2*k*(m*m +m*n)<=num; k++) {
						nums[2*k*(m*m +m*n)]++;
						if(nums[2*k*(m*m +m*n)] == 1) count++;
						if(nums[2*k*(m*m +m*n)] == 2) count--;
					}
				}
			}
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
