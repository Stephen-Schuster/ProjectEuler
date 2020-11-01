package ProjectEuler;

public class problem23 {
	public static void main(String[] args) {
		int[] abnums = new int[6965];
		int total = 0;
		for(int i = 10; i<28123; i++) {
			if(sumOfDivisors(i)>i) {
				abnums[total] = i;
				total++;
			}
		}
		int sum = 0;
		for(int i = 1; i<28123; i++) {
			if(!isSumOf2AbNums(i, abnums)) {
				sum+=i;
			}
			System.out.println(i);
		}
		System.out.println(sum);
	}
	public static boolean isSumOf2AbNums(int num, int[] abnums) {
		for(int i = 0; abnums[i]<num; i++) {
			for(int j = 0; abnums[j]<num; j++) {
				if(abnums[j]+abnums[i] == num) {
					return true;
				}
			}
		}
		return false;
	}
	public static int sumOfDivisors(int num) {
		int sum = 1;
		for(double i = 2; i<=Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				sum+=i;
				if(i!=num/i) {
					sum+=num/i;
				}
			}
		}
		return sum;
	}
}
