package ProjectEuler;

public class Problem27 {
	public static void main(String[] args) {
		int best = 0;
		int besti = 0;
		int bestj = 0;
		for(int signi = -1; signi<=1; signi+=2) {
			for(int i = 1; i<=1000;i+=2) {
				for(int signj = -1; signj<=1; signj+=2) {
					for(int j = 1; j<=1000;j+=2) {
						int x = 0;
						for(x=0; isPrime(Math.abs(x*x + x*i*signi + j*signj)); x++) {
						}
						if(x>=best) {
							besti = i*signi;
							bestj = j*signj;
							best = x;
						}
					}
				}
			}
		}
		System.out.println(bestj * besti + " " + besti + " " +  bestj + " " +  best);
	}
	public static boolean isPrime(int num) {
		for(double i = 3.0; i<=Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				return false;
			}
		}
		return true;
	}
}
