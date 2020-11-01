package ProjectEuler;

public class Problem40 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int prod = 1;
		for(int i = 0; i<7; i++) {
			prod*=findDChaConst((long) Math.pow(10, i));
		}
		System.out.println(prod);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int findDChaConst(long num) {
		int onNum = 1;
		int digNum = 0;
		while(digNum<num) {
			digNum+=Integer.toString(onNum).length();
			onNum++;
		}
		onNum--;
		digNum-=Integer.toString(onNum).length();
		return Character.getNumericValue(Integer.toString(onNum).charAt((int) (num-digNum-1)));
	}
}
