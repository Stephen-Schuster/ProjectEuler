package ProjectEuler;

public class Problem493 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(clrIncluded(0)*7);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static double clrIncluded(int clrsDropt) {
		int cD=10*clrsDropt;
		if(cD == 50) {
			return 1;
		}
		return 1-(MyU.factorial(50.0-cD)*MyU.factorial(60.0-cD))/(MyU.factorial(70.0-cD)*MyU.factorial(40.0-cD));
	}
}
