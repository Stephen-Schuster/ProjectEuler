package ProjectEuler;

public class realAnswer493 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		double ansSum = 0;
		double chanceSum = 0;
		for(int distClrs = 7; distClrs>1; distClrs--) {
			int drop = 0;
			double chance = 1;
			while( drop<=6-distClrs) {
				chance*=clrNotIncluded(drop);
				drop++;
			}
			for(int i = 7; i>drop; i--) {
				chance*=clrIncluded(drop);
			}
			chanceSum+=chance;
			ansSum+=chance*distClrs;
		}
		System.out.println(Double.toString(ansSum).substring(0, 11));
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static double clrIncluded(int clrsDropt) {
		int cD=10*clrsDropt;
		if(cD == 50) {
			return 1;
		}
		return 1-(MyU.factorial(50.0-cD)*MyU.factorial(60.0-cD))/(MyU.factorial(70.0-cD)*MyU.factorial(40.0-cD));
	}
	public static double clrNotIncluded(int clrsDropt) {
		int cD=10*clrsDropt;
		if(cD == 50) {
			return 0;
		}
		return (MyU.factorial(50.0-cD)*MyU.factorial(60.0-cD))/(MyU.factorial(70.0-cD)*MyU.factorial(40.0-cD));
	}
}
