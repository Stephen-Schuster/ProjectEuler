package ProjectEuler;

public class Problem45 {
		public static void main(String[] args) {
			long time = System.currentTimeMillis();
			for(int i = 286; true; i++) {
				int triNum = triNumFor(i);
				if(isHexagonal(triNum)&&isPentagonal(triNum)) {
					System.out.println(triNum);
					break;
				}
			}
			System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
		}
		public static int pentNumFor(int place) {
			return (int)(0.5*place*(3*place-1));
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
			for(int i = 1; pentNumFor(i)<=num; i++) {
				if(pentNumFor(i)==num) return true;
			}
			return false;
		}
}
