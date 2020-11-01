package ProjectEuler;

import java.util.ArrayList;

public class Problem95 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		boolean[] nums = new boolean[1000001];
		for(int i = 0; i<nums.length; i++) nums[i] = true;
		int best = 0, besti = 0;
		for(int i = 4; i<=10000; i++) {
			if(nums[i]) {
				int streak = 0;
				int testNum = i;
				nums[i] = false;
				ArrayList<Integer> currNums = new ArrayList<Integer>();
				while(true) {
					testNum = MyU.sumOfDivisors(testNum);
					if(testNum == i) break;
					if(testNum>1000000) {
						streak = 0;
						break;
					}
					if(!nums[testNum]) {
						if(currNums.contains(testNum)) {
							streak = currNums.size()-currNums.indexOf(testNum);
							break;
						}
					}
					currNums.add(testNum);
					nums[testNum] = false;
					streak++;
				}
				if(streak>best) {
					besti = i;
					best = streak;
				}
			}
		}
		int i = besti;
		int testNum = i;
		int streak = 0;
		ArrayList<Integer> currNums = new ArrayList<Integer>();
		while(true) {
			currNums.add(testNum);
			testNum = MyU.sumOfDivisors(testNum);
			if(currNums.contains(testNum)) {
				while(0<currNums.indexOf(testNum)) currNums.remove(0);
				break;
			}
		}
		best = currNums.get(0);
		for(int hm = 1; hm<currNums.size(); hm++) {
			if(currNums.get(hm)<best) best = currNums.get(hm);
		}
		System.out.println(best);
		System.out.println((System.currentTimeMillis()-time)/1000.0+" seconds");
	}
}
