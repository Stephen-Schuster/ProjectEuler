package ProjectEuler;

import java.math.BigInteger;

public class Problem29 {
	public static void main(String[] args) {
		BigInteger[] arr = new BigInteger[9801];
		int count = 0;
		for(int a = 2; a<=100; a++) {
			for(int b = 2; b<=100; b++) {
				boolean isDistinct = true;
				BigInteger a1 = new BigInteger(Integer.toString(a));
				for(int i = 0; i<count; i++) {
					if(a1.pow(b).equals(arr[i])) {
						isDistinct = false;
						break;
					}
				}
				if(isDistinct) {
					BigInteger b1 = new BigInteger(a1.pow(b).toString());
					arr[count] = b1;
					count++;
				}
				System.out.println(a+ "," + b);
			}
		}
		System.out.println(count);
	}
}
