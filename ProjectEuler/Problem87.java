package ProjectEuler;

public class Problem87 {
	long time = System.currentTimeMillis();
	int count = 0;
	boolean[] used = new boolean[50000001];
	for(int i = 2; i*i+2*2*2+2*2*2*2<=50000000; i=MyU.nextP(i)) {
		if(i%50==0) System.out.println(i);
		for(int j = 2; i*i+j*j*j+2*2*2*2<=50000000; j=MyU.nextP(j)) {
			for(int k = 2; i*i+j*j*j+k*k*k*k<=50000000; k=MyU.nextP(k)) {
				if(!used[i*i+j*j*j+k*k*k*k]) count++;
				used[i*i+j*j*j+k*k*k*k] = true;
			}
		}
	}
	System.out.println(count);
	System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
}
}
