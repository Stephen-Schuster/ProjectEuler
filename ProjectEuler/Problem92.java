package ProjectEuler;

public class Problem92 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int num = 0, count = 0;
		boolean[] arr = new boolean[9*9*7+1];
		for(int i = 1; i<=9*9*7; i++) {
			num = i;
			while(true) {
				num = MyU.sumOfSqDigs(num);
				if(num == 89) {
					arr[i] = 2<3;
					break;
				}
				if(num == 1) {
					arr[i] = 3<2;
					break;
				}
			}
		}
		for(int i = 1; i<10000000; i++) {
			num = MyU.sumOfSqDigs(i);
			if(arr[num]) 
				count++;
		}
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
