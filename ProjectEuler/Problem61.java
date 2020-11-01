package ProjectEuler;

import java.util.ArrayList;

public class Problem61 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean[] first = new boolean[100];
		boolean[] last = new boolean[100];
		boolean[] both = new boolean[100];
		boolean found = false;
		for(int i = 3; i<=8; i++) {
			int num = 0;
			for(int j = 1; num<10000; j++) {
				if(num>999 && num%100>9) {
					first[num/100] = true;
					last[num%100] = true;
					if(first[num%100]) {
						both[num%100] = true;
					}
					if(last[num/100]) both[num/100] = true;
				}
				num = ((j*j)*(i-2) - j*(i-4))/2;
			}
		}
		ArrayList<Integer> sides = new ArrayList<Integer>();
		for(int i = 3; i<=8; i++) {
			sides.add(i);
		}
		int[] nums = new int[6];
		for(int i = 0; i<MyU.factorial(5) && !found; i++) {
			char[] seqc = MyU.sequence(i, 5).toCharArray();
			String seq = "";
			for(char x: seqc) {
				seq+=Character.getNumericValue(x)+4;
			}
			seq=3+seq;
			for(int og = 10; og<100 && !found; og++) {
				if(both[og]) {
					int s = Character.getNumericValue(seq.charAt(0));
					for(int n = (int)(MyU.SgonalNumFor(og*100,s)+0.99999999); MyU.nthSgonalNum(n,s)<(og+1)*100; n++) {
						if(MyU.forLoops61(nums,seq.substring(1),MyU.nthSgonalNum(n,s)%100, both, og, arr)) {
							nums[0] = og;
							arr.add(MyU.nthSgonalNum(n,s));
							found = true;
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i<arr.size(); i++) {
			sum+=arr.get(i);
		}
		System.out.println(sum);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
