package ProjectEuler;

import java.util.ArrayList;

public class Problem25 {
	public static void main(String[] args) {
		int best = 0;
		int bestnum = 0;
		for(int i = 2; i<1000; i++) {
			if(digitsRepeat(i)>=best) {
				best = digitsRepeat(i);
				bestnum = i;
			}
		}
		System.out.println(best+ " " + bestnum);
	}
	public static int digitsRepeat(int num) {
		ArrayList<Integer> carries = new ArrayList<Integer>();
		int currentcarry = 1;
		for(int i = 1; i<num; i++) {
			carries.add(currentcarry);
			currentcarry = (currentcarry*10)%num;
			for(int j = 0; j<carries.size(); j++) {
				if(carries.get(j)==currentcarry) {
					return i+1;
				}
			}
		}
		return num-1;
	}

}
