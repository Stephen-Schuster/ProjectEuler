package ProjectEuler;

public class Problem60 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ans = -1;
		boolean found = false;
		for(int i = 675; !found; i+=2) {
			if(i%100 == 1) System.out.println(i);
			if(MyU.isPrime(i)) {
				for(int j = 11; j<i && !found; j+=2) {
					if(MyU.isPrime(j) && MyU.isPrime(MyU.concat(i,j)) && MyU.isPrime(MyU.concat(j,i))) {
						for(int k = 7; k<j && !found; k+=2) {
							if(MyU.isPrime(k) && MyU.isPrime(MyU.concat(k,j)) && MyU.isPrime(MyU.concat(j,k))&& MyU.isPrime(MyU.concat(k,i)) && MyU.isPrime(MyU.concat(i,k))) {
								for(int l = 5; l<k && !found; l+=2) {
									if(MyU.isPrime(l) && MyU.isPrime(MyU.concat(k,l)) && MyU.isPrime(MyU.concat(l,k))&& MyU.isPrime(MyU.concat(l,i)) && MyU.isPrime(MyU.concat(i,l))&& MyU.isPrime(MyU.concat(j,l)) && MyU.isPrime(MyU.concat(l,j))) {
										for(int m = 3; m<l && !found; m+=2) {
											if(MyU.isPrime(m) && MyU.isPrime(MyU.concat(m,l)) && MyU.isPrime(MyU.concat(l,m))&& MyU.isPrime(MyU.concat(m,i)) && MyU.isPrime(MyU.concat(i,m))&& MyU.isPrime(MyU.concat(j,m)) && MyU.isPrime(MyU.concat(m,j))&& MyU.isPrime(MyU.concat(k,m)) && MyU.isPrime(MyU.concat(m,k))) {
												found = true;
												ans = i+j+k+l+m;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
