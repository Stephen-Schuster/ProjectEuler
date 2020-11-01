package ProjectEuler;

public class Problem80 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sum = 0;
		char[] c = new char[99];
		LargeDecimal dec = new LargeDecimal(1,"0",true);
		for(int i = 2; i<100; i++) {
			if(Math.sqrt(i)%1 != 0) {
				dec.setIntPart(i);
				dec.setStuffAfterDecimal("0");
				dec = dec.sqrt(99);
				c = dec.getStuffAfterDecimal().toCharArray();
				for(char x: c) {
					sum+=Character.getNumericValue(x);
				}
				sum+=(int)Math.sqrt(i);
			}
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
