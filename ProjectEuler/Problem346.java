package ProjectEuler;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem346 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		BigInteger sum = new BigInteger("1"); //this is the answer, starts at 1 because it isn't counted
		ArrayList<Long> countedNums = new ArrayList<Long>(); //a list of all the numbers that have already been counted 
																   //so there's no double counting
		for(int base = 2; true; base++) {
			boolean inBounds = true;
			long num = (long)base*(long)base + (long)base +1; //111(3 digs) in the current base
			if(num>Math.pow(10, 12)) break;
			for(int digs = 3; inBounds; digs++) {
				if(!MyU.sortedListHas(countedNums,(int)num)) {//making sure there's no double counting
					BigInteger n = new BigInteger(Long.toString(num));
					sum=sum.add(n);//counting the number
					MyU.add2SortedList(countedNums,(int)num);//putting it down as counted
				}
				num+=Math.pow(base, digs); //adding a digit to the number
				inBounds = num<Math.pow(10, 12); //updating the boolean inBounds
			}
		}
		System.out.println(sum); //printing the answer
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
