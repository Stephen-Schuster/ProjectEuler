package ProjectEuler;

public class Problem44 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int best = 0;
		boolean notFound = true;
		for(int i = 1; notFound; i+=0) {
			i++;
			int penti = pentNumFor(i);
			for(int j = i-1; j>0; j--) {
				int pentj = pentNumFor(j);
				if(isPentagonal(penti+pentj)&&isPentagonal(penti-pentj)) {
					notFound = false;
					best = penti-pentj;
					break;
				}
			}
		}
		System.out.println(best);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int pentNumFor(int place) {
		return (int)(0.5*place*(3*place-1));
	}
	public static long pentNumFor(long place) {
		return (long)(0.5*place*(3*place-1));
	}
	public static boolean isTriangular(int num) {
		return (Math.sqrt(8*num + 1) == (int)(Math.sqrt(8.0*num + 1)));
	}
	public static int triNumFor(int num) {
		return (int) (0.5*num*(num+1));
	}
	public static boolean isHexagonal(int num) {
		for(int i = 1; hexNumFor(i)<=num; i++) {
			if(hexNumFor(i)==num) return true;
		}
		return false;
	}
	public static int hexNumFor(int num) {
		return num*(2*num-1);
	}
	public static boolean isPentagonal(int num) {
		return ((Math.sqrt(24*num+1)+1)/6 == (int)((Math.sqrt(24*num+1)+1)/6));
	}
	public static boolean isPentagonal(long num) {
		for(int i = 1; pentNumFor(i)<=num; i++) {
			if(pentNumFor(i)==num) return true;
		}
		return false;
	}
}