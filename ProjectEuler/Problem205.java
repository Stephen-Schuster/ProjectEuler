package ProjectEuler;

public class Problem205 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int[] PP = new int[37];
		int[] CC = new int[37];
		int totalp = (int) Math.pow(4, 9);
		int totalc = (int) Math.pow(6, 6);
		forLoops205P(0,9,PP);
		forLoops205C(0,6,CC);
		double[] PPP = new double[37];
		double[] CCP = new double[37];
		for(int i = 0; i<37; i++) {
			PPP[i] = (double)PP[i]/totalp;
			CCP[i] = (double)CC[i]/totalc;
		}
		double chanceSum = 0.0;
		double sum = 0.0;
		for(int i = 1; i<PPP.length; i++) {
			sum+=CCP[i-1];
			chanceSum+=sum*PPP[i];
		}
		chanceSum*=10000000;
		chanceSum = (int)(chanceSum+0.5);
		chanceSum/=10000000;
		System.out.println(chanceSum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static void forLoops205C(int sum, int loopsLeft, int[] CC) {
		if(loopsLeft == 0) {
			CC[sum]++;
		} else {
			for(int i = 1; i<=6; i++) {
				forLoops205C(sum+i, loopsLeft-1, CC);
			}
		}
	}
	public static void forLoops205P(int sum, int loopsLeft, int[] PP) {
		if(loopsLeft == 0) {
			PP[sum]++;
		} else {
			for(int i = 1; i<=4; i++) {
				forLoops205P(sum+i, loopsLeft-1, PP);
			}
		}
	}
}
