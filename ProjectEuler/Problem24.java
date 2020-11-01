package ProjectEuler;

import java.util.Arrays;

public class Problem24 {
	public static long factorial(int num) {
		int f = 1;
		if(num == 0) {
			return 1;
		}
		for(int i = num; i>0; i--) {
			f*=i;
		}
		return f;
	}
	public static long numbers(int num) {
		long s = 0;
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 10; i>0; i--) {
			int r = (int) (num%factorial(i)/(factorial(i-1)));
			s = s*10+arr[r];
			for(int j = r; j<9; j++) {
				arr[j] = arr[j+1];
			}
		}
		return s;
	}
	public static void main(String[] args) {
		long[] s = new long[(int) factorial(10)];
		for(int i = 0; i<s.length; i++) {
			s[i] =numbers(i);
			System.out.println(i);
		}
		Arrays.sort(s);
		System.out.println(s[999999]);
	}
}
