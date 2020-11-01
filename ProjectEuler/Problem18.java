package ProjectEuler;

public class Problem18 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int best = 0;
		int[][] nums = {{75},{
			95,64},{
				17,47,82},{
				18,35,87,10},{
				20,04,82,47,65},{
				19,01,23,75,03,34},{
				88,02,77,73,07,63,67},{
				99,65,04,28,06,16,70,92},{
				41,41,26,56,83,40,80,70,33},{
				41,48,72,33,47,32,37,16,94,29},{
				53,71,44,65,25,43,91,52,97,51,14},{
				70,11,33,28,77,73,17,78,39,68,17,57},{
				91,71,52,38,17,14,91,43,58,50,27,29,48},{
				63,66,04,68,89,53,67,30,73,16,69,87,40,31},{
				04,62,98,27,23,9,70,98,73,93,38,53,60,04,23}};
		for(int i = 0; i<=1; i++) {
			int sum = nums[0][0];
			int up = 0;
			for(int j = 1; j<100; j++) {
				up+=i;
				sum+=nums[j][up];
			}
			if(sum>best) {
				best = sum;
			}
		}
		System.out.println(best);
		System.out.println((double)(System.currentTimeMillis()-time)/1000 + " seconds");
	}
	
	public static String addZeros(String num) {
		while(num.length()!=14) {
			num = "0" + num;
		}
		return num;
	}
}
