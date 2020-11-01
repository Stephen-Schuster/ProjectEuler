package ProjectEuler;

public class Problem206 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		boolean found = false;
		char[] digs = new char[19];
		for(int i = 100000000-1; i>10000000; i--) {
			String s = "900";
			String n = Integer.toString(i);
			for(int j = 0; j<n.length(); j++) {
				s = 8-j+(n.charAt(n.length()-1-j)+s);
			}
			for(int j = 0; j<8-n.length(); j++) {
				s = j+1+"0"+s;
			}
			if(Math.sqrt(Long.parseLong(s))%1 == 0) {
				System.out.println(s);
				System.out.println((long)Math.sqrt(Long.parseLong(s)));
				break;
			}
		}
		System.out.println((double)(System.currentTimeMillis()-time)/1000+" seconds");
	}
}
