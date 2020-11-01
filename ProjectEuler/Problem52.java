package ProjectEuler;

import java.util.ArrayList;

public class Problem52 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ans = 0;
		boolean found = false;
		for(int i = 11; !found; i++) {
			if(isValidP52(i)) {
				if(arePerms(i,2*i) 
				&& arePerms(i*2,i*3) 
				&& arePerms(i*3,i*4) 
				&& arePerms(i*5,i*4) 
				&& arePerms(i*5,i*6)) {
					ans = i;
					found = true;
				}
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static boolean isValidP52(int num) {
		String s = Integer.toString(num);
		if(Character.getNumericValue(s.charAt(0))>1) {
			return false;
		}
		if(Character.getNumericValue(s.charAt(1))>6) {
			return false;
		}
		return true;
	}
	public static boolean arePerms(int num1, int num2) {
		ArrayList<Character> digs1 = new ArrayList<Character>();
		ArrayList<Character> digs2 = new ArrayList<Character>();
		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i = 0; i<s1.length(); i++) {
			digs1.add(s1.charAt(i));
		}
		for(int i = 0; i<s2.length(); i++) {
			digs2.add(s2.charAt(i));
		}
		for(int i = 0; i<s1.length(); i++) {
			if(digs2.contains(digs1.get(i))) {
				digs2.remove(digs2.indexOf(digs1.get(i)));
			} else {
				return false;
			}
		}
		return true;
	}
}
