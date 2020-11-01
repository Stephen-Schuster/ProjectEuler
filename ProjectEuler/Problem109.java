package ProjectEuler;

public class Problem109 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ct = 0;
		int ct1 = 0, ct2 = 0, ct3 = 0;
		for(dartInfo i = new dartInfo(2,1); i.multiplier<3; i.nextDart()) {
			if(i.getTotal()<100) ct++;
			for(dartInfo j = new dartInfo(1,1); j.multiplier<4; j.nextDart()) {
				if(i.getTotal()+j.getTotal()<100)ct++;
				for(dartInfo k = new dartInfo(j.multiplier,j.val); k.multiplier<4; k.nextDart()) {
					if(i.getTotal()+j.getTotal()+k.getTotal()<100)ct++;
				}
			}
		}
		System.out.println(ct);
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
