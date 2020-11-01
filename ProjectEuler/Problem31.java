package ProjectEuler;

public class Problem31 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis(); 
		System.out.println(returnCount());
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
	public static int returnCount() {
		int pleft = 200;
		int ans = 0;
		for(int TPs = 0; TPs<=pleft/200; pleft = 200 ) {
			pleft = 200 - 200*TPs;
			for(int Ps = 0; Ps<=pleft/100; pleft = 200 - 200*TPs ) {
				pleft = 200 - 200*TPs - 100*Ps;
				for(int p50s = 0; p50s<=pleft/50; pleft = 200 - 200*TPs - 100*Ps ) {
					pleft = 200 - 200*TPs - 100*Ps - 50*p50s;
					for(int p20s = 0; p20s<=pleft/20; pleft = 200 - 200*TPs - 100*Ps - 50*p50s ) {
						pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s;
						for(int p10s = 0; p10s<=pleft/10; pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s ) {
							pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s - 10*p10s;
							for(int p5s = 0; p5s<=pleft/5; pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s - 10*p10s ) {
								pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s - 10*p10s - 5*p5s;
								for(int p2s = 0; p2s<=pleft/2; pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s - 10*p10s - 5*p5s ) {
									pleft = 200 - 200*TPs - 100*Ps - 50*p50s - 20*p20s - 10*p10s - 5*p5s - 2*p2s;
									int p1s = pleft;
									System.out.println(TPs+" "+Ps+" "+p50s+" "+p20s+" "+p10s+" "+p5s+" "+p2s+" "+p1s+" "+ans);
									ans++;
									p2s++;
								}
								p5s++;
							}
							p10s++;
						}
						p20s++;
					}
					p50s++;
				}
				Ps++;
			}
			TPs++;
		}
		return ans;
	}
}
