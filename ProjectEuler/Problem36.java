package ProjectEuler;

public class Problem36 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int[] goods = new int[19];
		int count = 0;
		for(int i = 1; i<1000000; i+=2) {
			if(isPdrome(Integer.toBinaryString(i))&&isPdrome(i)) {
				goods[count] = i;
				count++;
			}
			System.out.println(i);
		}
		int sum = 0;
		for(int i = 0; i<19; i++) {
			sum+=goods[i];
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean isPdrome(int num) {
		String s = Integer.toString(num);
		int length = s.length();
		for(int i = 0; i<length/2; i++) {
			if(s.charAt(i) != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPdrome(String num) {
		String s = num;
		int length = s.length();
		for(int i = 0; i<length/2.0; i++) {
			if(s.charAt(i) != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
}
