package ProjectEuler;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;



public class MyU {
	public static ArrayList<Integer> factorsAL(int n) {
		ArrayList<Integer> facs = new ArrayList<Integer>();
		for(int i = 1; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				facs.add(i);
				facs.add(n/i);
			}
		}
		if(Math.sqrt(n)%1 == 0) {
			facs.add((int) (Math.sqrt(n)));
		}
		return facs;
	}
	public static int[] factors(int n) {
		ArrayList<Integer> facs = new ArrayList<Integer>();
		for(int i = 1; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				facs.add(i);
				facs.add(n/i);
			}
		}
		if(Math.sqrt(n)%1 == 0) {
			facs.add((int) (Math.sqrt(n)));
		}
		int[] facts = new int[facs.size()];
		for(int i = 0; i<facs.size(); i++) {
			facts[i] = facs.get(i);
		}
		return facts;
	}
	public static int concat(int a, int b) {
		for(int i = 1; true; i++) {
			if(Math.pow(10, i)>b) {
				return (int) (a*Math.pow(10, i)+b);
			}
		}
	}
	public static int concat2(int a, int b) {
		String s1 = Integer.toString(a), s2 = Integer.toString(b);
		return Integer.parseInt(s1+s2);
	}
	public static int sumOfSqDigs(int num) {
		int sum = 0;
		String s = Integer.toString(num);
		for(int j = 0; j<s.length(); j++) {
			sum+= Math.pow(Character.getNumericValue(s.charAt(j)),2);
		}
		return sum;
	}
	public static int sum(int[] nums) {
		int sum = 0;
		for(int i = 0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	public static double sum(double[] nums) {
		int sum = 0;
		for(int i = 0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	public static long sum(long[] nums) {
		int sum = 0;
		for(int i = 0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	public static boolean contains(int[] nums, int target) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == target) {
				return true;
			}
		}
		return false;
	}
	public static int indexOf(int[] nums, int tar) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == tar) {
				return i;
			}
		}
		return -1;
	}
	public static int[] copy(int[] nums) {
		int[] copy = new int[nums.length];
		for(int i = 0; i<copy.length; i++) {
			
		}
	}
	public static boolean equals(int[] nums, int[] nums2) {
		if(nums.length != nums2.length) return false;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] != nums2[i]) return false;
		}
		return true;
	}
	public static boolean equals(boolean[] nums, boolean[] nums2) {
		if(nums.length != nums2.length) return false;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] != nums2[i]) return false;
		}
		return true;
	}
	public static boolean contains(double[] nums, double target) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == target) {
				return true;
			}
		}
		return false;
	}
	public static int indexOf(double[] nums, double tar) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == tar) {
				return i;
			}
		}
		return -1;
	}
	public static double[] copy(double[] nums) {
		return nums;
	}
	public static boolean equals(double[] nums, double[] nums2) {
		if(nums.length != nums2.length) return false;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] != nums2[i]) return false;
		}
		return true;
	}
	public static boolean contains(long[] nums, long target) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == target) {
				return true;
			}
		}
		return false;
	}
	public static int indexOf(long[] nums, long tar) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == tar) {
				return i;
			}
		}
		return -1;
	}
	public static long[] copy(long[] nums) {
		return nums;
	}
	public static boolean equals(long[] nums, long[] nums2) {
		if(nums.length != nums2.length) return false;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] != nums2[i]) return false;
		}
		return true;
	}
	public static boolean contains(String[] nums, String target) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == target) {
				return true;
			}
		}
		return false;
	}
	public static int indexOf(String[] nums, String tar) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == tar) {
				return i;
			}
		}
		return -1;
	}
	public static String[] copy(String[] nums) {
		return nums;
	}
	public static boolean equals(String[] nums, String[] nums2) {
		if(nums.length != nums2.length) return false;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i].equals(nums2[i])) return false;
		}
		return true;
	}
	public static void printArray(int[] list) {
		System.out.print("{");
		int i = 0;
		while(i<list.length) {
			System.out.print(list[i]);
			i++;
			if(i<list.length) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	public static void printArray(boolean[] list) {
		System.out.print("{");
		int i = 0;
		while(i<list.length) {
			System.out.print(list[i]);
			i++;
			if(i<list.length) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	public static void printArray(String[] list) {
		System.out.print("{");
		int i = 0;
		while(i<list.length) {
			System.out.print(list[i]);
			i++;
			if(i<list.length) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	public static void printArray(double[] list) {
		System.out.print("{");
		int i = 0;
		while(i<list.length) {
			System.out.print(list[i]);
			i++;
			if(i<list.length) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	public static void printArray(long[] list) {
		System.out.print("{");
		int i = 0;
		while(i<list.length) {
			System.out.print(list[i]);
			i++;
			if(i<list.length) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}
	public static int last(ArrayList<Integer> arr) {
		return arr.get(arr.size()-1);
	}
	public static boolean isCycliclySgonal(int[] nums) {
		for(int i = 0; i<5; i++) {
			if(!isSgonal(nums[i]*100+nums[i+1],i+3)) {
				return false;
			}
		}
		if(!isSgonal(nums[5]*100+nums[0],8)) {
			return false;
		}
		return true;
	}
	public static boolean isSgonal(int num, int s) {
		return(closeEnough((Math.sqrt(8*(s-2)*num+Math.pow(s-4, 2))+s-4)/(2*s-2)%1,0,0.0000001));
	}
	public static boolean arePrime(int[] nums) {
		for(int i = 0; i<nums.length;i++) {
			if(!isPrime(nums[i])) {
				return false;
			}
		}
		return true;
	}
	public static int polyNumFor(int n, int poly) {
		poly-=3;
		int n1 = n-1;
		n1=(int) (n1*(n1+1)*0.5);
		n1 = (int) ((n1*(n1+1)*0.5) + poly * n1);
		return n1;
	}
	public static boolean areCCprimes(int[] nums) {
		for(int i = 0; i<4; i++) {
			for(int j = i+1; j<5; j++) {
				if(!isPrime(Integer.parseInt(nums[i]+""+nums[j])) || !isPrime(Integer.parseInt(nums[j]+""+nums[i]))) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean isInBounds(int num) {
		if(num>95 && num<123) {
			return true;
		}
		if(num>64 && num<91) {
			return true;
		}
		if(num>38 && num<60) {
			return true;
		}
		if( num==36 || num==34 || num==33 || num==63 || num==32) {
			return true;
		}
		return false;
	}
	public static int xor(int il, int ikey) {
		String l = addZeros(Integer.toBinaryString(il),8);
		String key = addZeros(Integer.toBinaryString(ikey),8);
		String ans = "";
		for(int i = 0; i<8; i++) {
			if(l.charAt(i)!=key.charAt(i)) {
				ans= ans+"1";
			} else {
				ans = ans + "0";
			}
		}
		return Integer.parseInt(ans,2);
	}
	public static String addZeros(String s, int l) {
		while(s.length()<l) {
			s = "0" + s;
		}
		return s;
	}
	public static int mode(int[] sequence) 
    {
        int maxValue = 0, maxCount = 0;
 
        for (int i = 0; i < sequence.length; ++i) 
        {
            int count = 0;
            for (int j = 0; j < sequence.length; ++j) 
            {
                if (sequence[j] == sequence[i])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = sequence[i];
            }
        }
 
        return maxValue;
    }
	public static int mode2(int[] sequence) 
    {
        int maxValue = mode(sequence);
        int maxValue2 = 0, maxCount2 = 0;
 
        for (int i = 0; i < sequence.length; ++i) 
        {
        	if(sequence[i] != maxValue) {

                int count = 0;
                for (int j = 0; j < sequence.length; ++j) 
                {
                    if (sequence[j] == sequence[i])
                        ++count;
                }
                if (count > maxCount2) 
                {
                    maxCount2 = count;
                    maxValue2 = sequence[i];
                }
        	}
        }
        return maxValue2;
    }
	public static int mode3(int[] sequence) 
    {
        int maxValue = mode(sequence);
        int maxValue2 = mode2(sequence);
        int maxValue3 = 0, maxCount3 = 0;
 
        for (int i = 0; i < sequence.length; ++i) 
        {
        	if(sequence[i] != maxValue && sequence[i] != maxValue2) {

                int count = 0;
                for (int j = 0; j < sequence.length; ++j) 
                {
                    if (sequence[j] == sequence[i])
                        ++count;
                }
                if (count > maxCount3) 
                {
                    maxCount3 = count;
                    maxValue3 = sequence[i];
                }
        	}
        }
        return maxValue3;
    }
	public static int handleHand(String hand, int cardNum) {
		hand = hand.replaceAll("\\s","");
		String card = hand.substring((cardNum-1)*2,(cardNum-1)*2);
		
	}
	public static long handScore(String hand) {
		hand = hand.replaceAll("\\s","");
		ArrayList<Integer> cards = new ArrayList<Integer>();
		ArrayList<Integer> cards1 = new ArrayList<Integer>();
		for(int i = 0; i<5; i++) {
			cards.add(cardScore(hand.substring(2*i, 2*i+1)));
			cards1.add(cardScore(hand.substring(2*i, 2*i+1)));
		}
		long handScore = 0;
		for(int i = 0; i<5; i++) {
			handScore*=100;
			handScore+=Math.max(Math.max(Math.max(cards.get(0)%13,cards.get(1)%13), Math.max(cards.get(2)%13,cards.get(3)%13)),cards.get(4)%13);
			cards.remove(cards.indexOf(Math.max(Math.max(Math.max(cards.get(0)%13,cards.get(1)%13), Math.max(cards.get(2)%13,cards.get(3)%13)),cards.get(4)%13)));
		}
		if(isRoyalFlush(cards1)) {
			handScore+=9100000000000L;
			return handScore;
		}
		if(isStraightFlush(cards1)) {
			handScore+=8100000000000L;
			return handScore;
		}
		String m4 = isFourOfAKind(cards1);
		if(m4.charAt(0)=='1') {
			handScore+=7000000000000L + cards1.get(Character.getNumericValue(m4.charAt(1)))/13*10000000000L;
		}
		
	}
	public static boolean isStraightFlush(ArrayList<Integer> cards) {
		int suit = cards.get(0)/13;
		for(int j = 0; j<10; j++) {
			for(int i = j+0; i<j+4; i++) {
				if(cards.contains(i+suit*13)) {
					cards.remove(cards.indexOf(i+suit*13));
				} else {
					return false;
				}
			}
		}
		return true;
	}
	public static String isFourOfAKind(ArrayList<Integer> cards) {
		if(isFourOfAKind1(cards)) {
			return "10";
		} else if(isFourOfAKind2(cards)) {
			return "11";
		} else {
			return "00";
		}
	}
	public static boolean isFourOfAKind1(ArrayList<Integer> cards) {
		int face = cards.get(0)%13;
		int misses = 0;
		for(int i = 1; i<5; i++) {
			if(!(cards.get(i)%13 == face)) {
				misses++;
			}
		}
		return misses<2;
	}
	public static boolean isFourOfAKind2(ArrayList<Integer> cards) {
		int face = cards.get(1)%13;
		int misses = 0;
		for(int i = 1; i<5; i++) {
			if(!(cards.get(i)%13 == face)) {
				misses++;
			}
		}
		return misses<2;
	}
	public static boolean isRoyalFlush(ArrayList<Integer> cards) {
		int suit = cards.get(0)/13;
		for(int i = 8; i<13; i++) {
			if(cards.contains(i+suit*13)) {
				cards.remove(cards.indexOf(i+suit*13));
			} else {
				return false;
			}
		}
		return true;
	}
	public static int cardScore(String card) {
		char c = card.charAt(0);
		char s = card.charAt(1);
		int num = 0;
		if(c == 'T') {
			num = 10;
		} else if(c == 'J') {
			num = 11;
		} else if(c == 'Q') {
			num = 12;
		} else if(c == 'K') {
			num = 13;
		} else {
			num = Character.getNumericValue(c);
		}
		num-=2;
		if(s == 'C') num+=0;
		if(s == 'H') num+=13;
		if(s == 'S') num+=26;
		if(s == 'D') num+=39;
		return num;
	}
	public static int nextP(int n) {
		for(n++; !isPrime(n); n++) {
		}
		return n;
	}
	public static int lowestK(int n) {
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				return 2+(n-i-n/i);
			}
		}
		return -1;
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
	
	public static boolean arePerms(long num1, long num2) {
		ArrayList<Character> digs1 = new ArrayList<Character>();
		ArrayList<Character> digs2 = new ArrayList<Character>();
		String s1 = Long.toString(num1);
		String s2 = Long.toString(num2);
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

	public static int numFactors(int num) {
		if(num == 1) {
			return 1;
		}
		int ct = 0;
		for(double i = 2.0; i<Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				ct+=2;
			}
		}
		if(Math.sqrt(num)%1 == 0) ct++;
		return ct;
	}
	public static int numPFactors(int num) {
		int ct = 1;
		int i = 2;
		while(num%i == 0) {
			num/=i;
			ct++;
		}
		for(i = 3; i<num && !isPrime(num); i+=2) {
			if(isPrime(i)) {
				while(num%i == 0) {
					num/=i;
					ct++;
				}
			}
		}
		return ct;
	}
	public static ArrayList<Integer> pFactors(int num) {
		ArrayList<Integer> pfacs = new ArrayList<Integer>();
		int i = 2;
		while(num%i == 0) {
			num/=i;
			pfacs.add(i);
		}
		for(i = 3; i<num && !isPrime(num); i+=2) {
			if(isPrime(i)) {
				while(num%i == 0) {
					num/=i;
					pfacs.add(i);
				}
			}
		}
		if(num!=1) pfacs.add(num);
		return pfacs;
	}
	public static ArrayList<Integer> copy(ArrayList<Integer> arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		for(int i = 0; i<arr.size(); i++) {
			newArr.add(arr.get(i));
		}
		return newArr;
	}
	public static int numOfDistPFactors(int num) {
		int count = 1;
		ArrayList<Integer> pFactors = new ArrayList<Integer>();
		while(!isPrime(num)) {
			for(int i = 2; i<num; i++) {
				if(isPrime(i) && (double)num/i%1 == 0) {
					num /= i;
					if(!pFactors.contains(i)) {
						pFactors.add(i);
						count++;
					}
				}
			}
		}
		if(num == 1 || pFactors.contains(num)) {
			count--;
		}
		return count;
	}
	public static boolean fitsConjP46(int num) {
		for(int i = 2; i<num; i++) {
			if(isPrime(i) && (Math.sqrt(((double)num-i)/2)) == (int)Math.sqrt(((double)num-i)/2)) {
				return true;
			}
		}
		return false;
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
		return((Math.sqrt(8*num+1)+1)/4%1 == 0);
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
	public static boolean hasProperty(int i) {
		int[] primes = {2,3,5,7,11,13,17};
		for(int j = 0; j<primes.length; j++) {
			if(Integer.parseInt(sequence(i,10).substring(1+j, 4+j))%primes[j] != 0) {
				return false;
			}
		}
		return true;
	}
	public static String add1toAllDigits(String num) {
		String newS = "";
		for(int i = 0; i<num.length(); i++) {
			newS = newS + (Character.getNumericValue(num.charAt(i))+1);
		}
		return newS;
	}
	public static int findDChaConst(long num) {
		int onNum = 1;
		int digNum = 0;
		while(digNum<num) {
			digNum+=Integer.toString(onNum).length();
			onNum++;
		}
		onNum--;
		digNum-=Integer.toString(onNum).length();
		return Character.getNumericValue(Integer.toString(onNum).charAt((int) (num-digNum-1)));
	}
	public static int findSecondSide(int first, int per) {
		int upperB = per - first;
		int underB = 0;
		while(upperB-underB>1) {
			int second = (int) avg(upperB,underB);
			if(first*first + second*second == Math.pow(per-second-first, 2)) {
				return second;
			} else if(first*first + second*second < Math.pow(per-second-first, 2)) {
				underB = second;
			} else {
				upperB = second;
			}
		}
		return 0;
	}
	public static double avg(int num1, int num2) {
		return (num1+num2)/2.0;
	}
	public static boolean isTruncatablePrimeDiv(int num) {
		int length = Integer.toString(num).length();
		if(num<10) {
			return isPrime(num);
		} else {
			return isPrime(num) && isTruncatablePrimeDiv(num/10);
		}
	}
	public static boolean isTruncatablePrimeMod(int num) {
		int length = Integer.toString(num).length();
		if(num<10) {
			return isPrime(num);
		} else {
			return isPrime(num) && isTruncatablePrimeMod((int) (num%Math.pow(10, length-1)));
		}
	}
	public static boolean isCircularPrimeLength(int num) {
		String s = Integer.toString(num);
		int length = s.length();
		for(int i = 0; i<length;i++) {
			String testS = "";
			for(int j = 0; j<length; j++) {
				testS = testS + s.charAt((j+i)%length);
			}
			if(!isPrime(Integer.parseInt(testS))) {
				return false;
			}
		}
		return true;
	}
	public static String sequence(int num, int l) {
		String s = "0";
		int[] arr = new int[l];
		for(int i = 0; i<l; i++) {
			arr[i] = i;
		}
		for(int i = l; i>0; i--) {
			int r = (int) (num%factorial(i)/(factorial(i-1)));
			s = s+arr[r];
			for(int j = r; j<l-1; j++) {
				arr[j] = arr[j+1];
			}
		}
		return s.substring(1,s.length());
	}
	public static String sequence(long num, int l) {
		String s = "0";
		long[] arr = new long[l];
		for(int i = 0; i<l; i++) {
			arr[i] = i;
		}
		for(long i = l; i>0; i--) {
			int r = (int) (num%factorial(i)/(factorial(i-1)));
			s = s+arr[r];
			for(int j = r; j<l-1; j++) {
				arr[j] = arr[j+1];
			}
		}
		return s.substring(1,s.length());
	}
	public static int sumOfDigitsFacotrial(int num) {
		String s = Integer.toString(num);
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			sum+=factorial(Character.getNumericValue(s.charAt(i)));
		}
		return sum;
	}
	public static int dOfSimplifiedDigits(int num, int den) {
		return den/gcd(num,den);
	}
	public static int nOfSimplifiedDigits(int num, int den) {
		return num/gcd(num,den);
	}
	public static int gcd(int num1, int num2) {
		int best = 1;
		for(int i = 1; i<=num1; i++) {
			if((double)num1%i == 0 && (double)num2%i == 0) {
				best = i;
			}
		}
		return best;
	}
	public static int dOfCancelledDigits(int num, int den) {
		if(num%10 == den%10 || num/10 == den%10) {
			return den/10;
		}
		if(num%10 == den/10 || num/10 == den/10) {
			return den%10;
		}
		return den;
	}
	public static int nOfCancelledDigits(int num, int den) {
		if(num%10 == den%10 || num%10 == den/10) {
			return num/10;
		}
		if(num/10 == den%10 || num/10 == den/10) {
			return num%10;
		}
		return num;
	}
	public static boolean digitsCancelWell(int num, int den) {
		if(num%10==0||den%10==0) {
			return false;
		}
		int hits = 0;
		if(num%10 == den%10) {
			hits++;
		}
		if(num/10 == den%10) {
			hits+=5;
		}
		if(num%10 == den/10) {
			hits+=5;
		}
		if(num/10 == den/10) {
			hits++;
		}
		return(hits == 1 || hits == 6 || hits == 5);
	}
	public static boolean inArray(int[] arr, int num) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
			if(arr[i] == 0) {
				return false;
			}
		}
		return false;
	}
	public static boolean isPandigital1to9(String s) {
		for(int i = 0; i<s.length(); i++) {
			int hits = 0;
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(j) == s.charAt(i)) {
					hits++;
				}
				if(s.charAt(i) == '0'|| s.charAt(j) == '0') {
					return false;
				}
				if(hits>1) {
					return false;
				}
			}
		}
		return true;
	}
	public static int sumOfDigitsToTheFifith(int num) {
		String s = Integer.toString(num);
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			sum+=Math.pow(Character.getNumericValue(s.charAt(i)),5);
		}
		return sum;
	}
	public static boolean closeEnough(double num1, double num2, double dist) {
		return (Math.abs(num1 - num2)<dist);
	}
	public static boolean inFirstOfEight(int num) {
		if(hasDigit(num,0)) {
			int misses = 0;
			for(int i = 0; i<10; i++) {
				if(!isPrime(replaceDigit(num, 0, i))) {
					misses++;
				}
			}
			if(misses<=2) {
				return true;
			}
		}
		if(hasDigit(num,1)) {
			int misses = 1;
			for(int i = 1; i<10; i++) {
				if(!isPrime(replaceDigit(num, 1, i))) {
					misses++;
				}
			}
			if(misses<=2) {
				return true;
			}
		}if(hasDigit(num,2)) {
			int misses = 2;
			for(int i = 2; i<10; i++) {
				if(!isPrime(replaceDigit(num, 2, i))) {
					misses++;
				}
			}
			if(misses<=2) {
				return true;
			}
		}
		return false;
	}
	public static int replaceDigit(int num, int dig, int newDig) {
		String s = Integer.toString(num);
		for(int i = 0; i<s.length(); i++) {
			if(Character.getNumericValue(s.charAt(i)) == dig) {
				if(i == 0) {
					s = newDig + "" + s.substring(1,s.length());
				} else if(i == s.length()-1) {
					s = s.substring(0,s.length()-1)+""+newDig;
				} else {
					s = s.substring(0,i) + "" + newDig + s.substring(i+1,s.length());;
				}
			}
		}
		return Integer.parseInt(s);
	}
	public static boolean hasDigit(int num, int dig) {
		for(int i = 0; i<Integer.toString(num).length(); i++) {
			if(Character.getNumericValue(Integer.toString(num).charAt(i)) == dig) {
				return true;
			}
		}
		return false;
	}
	public static int[] firstThousandPrimes() {
		int[] primes = new int[265];
		int count = 0;
		for(int i = 1; i<=1000;i++) {
			if(isPrime(i)) {
				primes[count] = i;
				count++;
			}
		}
		return primes;
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
	public static int numbersLess(int a, int b, int c, int d, int e, int f, int g, int h, int i, int num) {
		int[] arr = {a,b,c,d,e,f,g,h,i};
		Arrays.sort(arr);
		for(int ind = 0; i<arr.length; i++) {
			if(arr[ind]<=num) {
				num++;
			}
		}
		return (int) num;
	}
	public static boolean isAmicable(int num) {
		return sumOfDivisors(sumOfDivisors(num)) == num && num != sumOfDivisors(num);
	}
	public static long factorial(int num) {
		int f = 1;
		for(int i = num; i>0; i--) {
			f*=i;
		}
		return f;
	}
	public static long factorial(long num) {
		int f = 1;
		for(long i = num; i>0; i--) {
			f*=i;
		}
		return f;
	}
	public static BigInteger factorialB(int num) {
		BigInteger f = new BigInteger("1");
		for(int i = num; i>0; i--) {
			BigInteger Bi = new BigInteger(Integer.toString(i));
			f = f.multiply(Bi);
		}
		return f;
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
	public static String addBnums(String num1, String num2) {
		num1 = "0" + num1;
		num2 = "0" + num2;
		while(num1.length()!=num2.length()) {
			if(num1.length()<num2.length()) {
				num1 = "0" + num1;
			} else {
				num2 = "0" + num2;
			}
		}
		int carry = 0;
		String newS = "";
		for(int i = num1.length()-1; i>=0; i--) {
			newS = (Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)))%10 + carry + newS;
			carry = (Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i)))/10;
		}
		return newS;
	}
	public static int divisors(int num) {
		int count = 0;
		for(double i = 1; i<Math.sqrt(num); i++) {
			if(num/i%1 == 0.0) {
				count+=2;
			}
		}
		if(Math.sqrt(num)%1 == 0) {
			count++;
		}
		return count;
	}
	public static double factorial(double num) {
		double f = 1;
		for(double i = num; i>0; i--) {
			f*=i;
		}
		return f;
	}
	public static boolean sortedListHas(ArrayList<Long> arr, long targ) {
		int loG = 0;
		int hiG = arr.size();
		while(hiG-loG>1) {
			int avg = (hiG+loG)/2;
			if(arr.get(avg)>targ) hiG = avg;
			else if(arr.get(avg)<targ) loG = avg;
			else return true;
		}
		return(hiG == targ || loG == targ);
	}
	public static boolean isBouncy(int n) {
		String s = Integer.toString(n);
		boolean up = false;
		boolean down = false;
		for(int i = 1; i<s.length(); i++) {
			if(s.charAt(i)<s.charAt(i-1)) {
				down = true;
			}
			if(s.charAt(i)>s.charAt(i-1)) {
				up = true;
			}
			if(up&&down) {
				return true;
			}
		}
		return false;
	}
	public static boolean isPdrome(int num) {
		String s = Integer.toString(num);
		int length = s.length();
		for(int i = 0; i<length/2; i++) {
			if(s.charAt(i) != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPdrome(String num) {
		String s = num;
		int length = s.length();
		for(int i = 0; i<length/2.0; i++) {
			if(s.charAt(i) != s.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
	public static int factors(double num, double divisor) {
		int numOfFactors = 0;
		while(true) {
			 if(num/divisor%1 == 0) {
				 numOfFactors++;
				 num/=divisor;
			 } else {
				 return numOfFactors;
			 }
		}
	}
	public static int sumOsqrs(int uBound) {
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum+=Math.pow(i, 2);
		}
		return sum;
	}
	public static int addFacDigits(int num, int[] arr) {
		String s = Integer.toString(num);
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			sum+=arr[Character.getNumericValue(s.charAt(i))];
		}
		return sum;
	}
	public static int totient(int n, ArrayList<Integer> primes) {
		int n1 = n;
		for(int i = 0; n != 1; i++) {
			if((double)n%primes.get(i) == 0) {
				while((double)n%primes.get(i) == 0) {
					n/=primes.get(i);
				}
				n1*=(double)(primes.get(i)-1)/primes.get(i);
			}
		}
		return n1;
	}
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		double i = 2.0;
		if(num/i%1 == 0) {
			return false;
		}
		for(i = 3.0; i<=Math.sqrt(num); i++) {
			if(num/i%1 == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPrime(BigInteger num) {
		if(num.equals(BigInteger.ONE)) {
			return false;
		}
		BigInteger sqrt = sqrt(num);
		for(BigInteger i = BigInteger.TWO; i.compareTo(sqrt) != 1; i=i.add(BigInteger.ONE)) {
			if(num.mod(i).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		return true;
	}
	public static int btoi(boolean b) {
		if(b) {
			return 1;
		} else {
			return 0;
		}
	}
	public static BigInteger sqrt(BigInteger x) {
		BigInteger low = BigInteger.ONE;
		BigInteger hi = x;
		while(true) {
			BigInteger avg = hi.add(low).divide(BigInteger.TWO);
			int comp = avg.multiply(avg).compareTo(x);
			if(comp > 0) {
				hi = avg;
			} else if(comp < 0) {
				low = avg;
			} else {
				return avg;
			}
			if(hi.subtract(low).equals(BigInteger.ONE)) {
				return low;
			}
		}
	}
	public static ArrayList<Integer> compsUpTo(int limit) {
		ArrayList<Integer> primes = SortedPrimesBelow(limit+1);
		ArrayList<Integer> comps = new ArrayList<Integer>();
		int point = 0;
		for(int i = 1; i<=limit; point++) {
			if(point<primes.size()) {
				for(i++; i<primes.get(point); i++) {
					comps.add(i);
				}
			} else {
				for(i++; i<=limit; i++) {
					comps.add(i);
				}
			}
			
		}
		return comps;
	}
	public static ArrayList<Object> ALcopy(Object[] nums) {
		ArrayList<Object> arr = new ArrayList<Object>();
		for(int i = 0; i<nums.length; i++) {
			arr.add(nums[i]);
		}
		return arr;
	}
	public static ArrayList<Integer> SortedPrimesBelow(int limit) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		boolean good;
		for(int i = 6; i-1<limit; i+=6) {
			int sqrt1 = (int) Math.sqrt(i-1);
			good = true;
			int j = 2;
			if(primes.size()>2) {
				while(primes.get(j)<=sqrt1) {
					if((i-1)%primes.get(j)==0) {
						good=false;
						break;
					}
					j++;
					if(j==primes.size()) break;
				}
			}
			if(good) {
				primes.add(i-1);
			}
			if(i+1>=limit) break;
			int sqrt = (int) Math.sqrt(i+1);
			good = true;
			j = 2;
			if(primes.size()>2) {
				while(primes.get(j)<=sqrt) {
					if((i+1)%primes.get(j)==0) {
						good=false;
						break;
					}
					j++;
					if(j==primes.size()) break;
				}
			}
			if(good) {
				primes.add(i+1);
			}
		}
		return primes;
	}
	public static String contFracSqrt(BigInteger n, BigInteger i) {
		BigInteger t;
		BigInteger m = BigInteger.ZERO, d = BigInteger.ONE, a = sqrt(n);
		ArrayList<BigInteger> As = new ArrayList<BigInteger>();
		As.add(a);
		for(BigInteger ct = BigInteger.ZERO; ct.compareTo(i) == -1; ct=ct.add(BigInteger.ONE)) {
			m = d.multiply(a).subtract(m);
			d = (n.subtract(m.multiply(m))).divide(d);
			a = (MyU.sqrt(n).add(m)).divide(d);
			As.add(a);
		}
		BigInteger num = As.get(As.size()-1);
		BigInteger den = BigInteger.ONE;
		for(int in = As.size()-2; in>=0; in--) {
			t = den;
			den = num;
			num = t;
			num = num.add(As.get(in).multiply(den));
		}
		return num+"/"+den;
	}
	public static void add2SortedList(ArrayList<Long> arr, long n) {
		int loG = 0;
		int hiG = arr.size();
		while(hiG-loG>1) {
			int avg = (hiG+loG)/2;
			if(arr.get(avg)>n) hiG = avg;
			else if(arr.get(avg)<n) loG = avg;
			else {
				arr.add(avg,n);
				return;
			}
		}
		arr.add(hiG, n);
	}
}