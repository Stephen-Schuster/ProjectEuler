package ProjectEuler;

public class Problem145 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int count = 0;
		for(int i = 1; i<100000000; i++) {
			if(i%1000000==0) System.out.println(i);
			if(onlyOddDigits(i+reverseDigits(i)) && i%10!=0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println((System.currentTimeMillis()-time)/1000.0+" seconds");
	}
	public static int reverseDigits(int num) {
		String n = Integer.toString(num);
		String newN = "";
		for(int i = n.length()-1; i>=0; i--) {
			newN+=n.charAt(i);
		}
		return Integer.parseInt(newN);
	}
	public static boolean onlyOddDigits(int num) {
		String n = Integer.toString(num);
		for(int i = 0; i<n.length(); i++) {
			if(Character.getNumericValue(n.charAt(i))%2 == 0 ) {
				return false;
			}
		}
		return true;
	}
}
