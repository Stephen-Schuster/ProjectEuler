package ProjectEuler;

public class Problem32 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int count = 0;
		int[] prods = new int[1000];
		for(int i = 1; i<10; i++) {
			for(int j = 1000; j<10000; j++) {
				if(isPandigital1to9(Integer.toString(i)+Integer.toString(j)+Integer.toString(i*j))) {
					if(!inArray(prods, i*j)) {
						prods[count] = i*j;
						System.out.println(prods[count]+" " + i+" "+j);
						count++;
					}
				}
			}
		}
		for(int i = 10; i<100; i++) {
			for(int j = 100; j<1000; j++) {
				if(isPandigital1to9(Integer.toString(i)+""+Integer.toString(j)+Integer.toString(i*j))) {
					if(!inArray(prods, i*j)) {
						prods[count] = i*j;
						System.out.println(prods[count]+" " + i+" "+j);
						count++;
					}
				}
			}
		}
		int sum = 0;
		for(int i = 0; i<=count; i++) {
			sum+=prods[i];
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
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
}
