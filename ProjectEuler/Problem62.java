package ProjectEuler;

public class Problem62 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		double n1 = 2.154435, n2 = 4.641589;
		boolean found = false;
		long[] ans = new long[5];
		for(long oOM = 0; !found; oOM++) {
			long numMB = (long) Math.pow(10, oOM);
			for(long i = numMB+4; i<numMB*n1; i++) {
				for(long j = numMB+3; j<i; j++) {
					if(MyU.arePerms((long)Math.pow(j, 3),(long)Math.pow(i, 3))) {
						for(long k = numMB+2; k<j; k++) {
							if(MyU.arePerms((long)Math.pow(j, 3),(long)Math.pow(k, 3))) {
								for(long l = numMB+1; l<k; l++) {
									if(MyU.arePerms((long)Math.pow(k, 3),(long)Math.pow(l, 3))) {
										for(long m = numMB; m<l; m++) {
											if(MyU.arePerms((long)Math.pow(l, 3),(long)Math.pow(m, 3))) {
												found = true;
												ans[0] = i; ans[1] = j; ans[2] = k; ans[3] = l; ans[4] = m;
												break;
											}
										}
									}
									if(found) break;
								}
							}
							if(found) break;
						}
					}
					if(found) break;
				}
			}
			if(found) break;
			numMB = (long) ( Math.pow(10, oOM)*n1);
			for(long i = numMB+4; i<(int)(numMB/n1+1)*n2; i++) {
				for(long j = numMB+3; j<i; j++) {
					if(MyU.arePerms((long)Math.pow(j, 3),(long)Math.pow(i, 3))) {
						for(long k = numMB+2; k<j; k++) {
							if(MyU.arePerms((long)Math.pow(j, 3),(long)Math.pow(k, 3))) {
								for(long l = numMB+1; l<k; l++) {
									if(MyU.arePerms((long)Math.pow(k, 3),(long)Math.pow(l, 3))) {
										for(long m = numMB; m<l; m++) {
											if(MyU.arePerms((long)Math.pow(l, 3),(long)Math.pow(m, 3))) {
												found = true;
												ans[0] = i; ans[1] = j; ans[2] = k; ans[3] = l; ans[4] = m;
												break;
											}
										}
									}
									if(found) break;
								}
							}
							if(found) break;
						}
					}
					if(found) break;
				}
			}
			if(found) break;
			numMB = (long) ( Math.pow(10, oOM)*n2);
			for(long i = numMB+4; i<(int)(numMB/n1+1)*10; i++) {
				for(long j = numMB+3; j<i; j++) {
					if(MyU.arePerms((long)Math.pow(j, 3),(long)Math.pow(i, 3))) {
						for(long k = numMB+2; k<j; k++) {
							if(MyU.arePerms((long)Math.pow(j, 3),(long)Math.pow(k, 3))) {
								for(long l = numMB+1; l<k; l++) {
									if(MyU.arePerms((long)Math.pow(k, 3),(long)Math.pow(l, 3))) {
										for(long m = numMB; m<l; m++) {
											if(MyU.arePerms((long)Math.pow(l, 3),(long)Math.pow(m, 3))) {
												found = true;
												ans[0] = i; ans[1] = j; ans[2] = k; ans[3] = l; ans[4] = m;
												break;
											}
										}
									}
									if(found) break;
								}
							}
							if(found) break;
						}
					}
					if(found) break;
				}
			}
		}
		System.out.println(Math.pow(ans[4], 3));
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
