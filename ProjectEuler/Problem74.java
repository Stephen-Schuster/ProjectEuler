package ProjectEuler;

import java.util.ArrayList;

public class Problem74 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int[] arr = new int[10];
		ArrayList<Integer> bad = new ArrayList<Integer>();
		bad.add(1); bad.add(2); bad.add(363601); bad.add(169);  bad.add(1454); bad.add(871); bad.add(872); bad.add(45361); bad.add(45362); bad.add(40585); bad.add(145);
		for(int i = 0; i<10; i++) {
			arr[i] = (int) MyU.factorial(i);
		}
		int superCount = 0;
		for(int i = 999999; i>1; i--) {
			int num = i, count = 0;
			boolean used = false;
			int badNum = -10;
			while(true) {
				num=MyU.addFacDigits(num,arr);
				count++;
				if(num == badNum) break;
				if(bad.contains(num) && !used) {
					badNum = num; 
					used = true;
				}
			}
			if(count>59) {
				superCount++;
			}
		}
		System.out.println(superCount);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
