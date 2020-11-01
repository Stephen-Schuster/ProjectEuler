package ProjectEuler;

public class dartInfo {
	public int val;
	public int multiplier;
	public dartInfo(int m, int v) {
		val = v;
		multiplier = m;
	}
	public void nextDart() {
		val++;
		if(val == 21) val = 25;
		if(val == 26 || (val == 25 && multiplier == 3)) {val = 1; multiplier++;}
	}
	public int getTotal() {return val*multiplier;}
}
