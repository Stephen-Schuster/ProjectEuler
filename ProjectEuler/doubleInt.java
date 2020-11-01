package ProjectEuler;

public class doubleInt implements Comparable{
	public int int1;
	public int int2;
	public doubleInt(int i1, int i2) {
		int1 = i1;
		int2 = i2;
	}
	public boolean isLessThan(doubleInt di) {
		if(this.int1<di.int1) return true;
		else if(this.int1>di.int1)return false;
		else {
			if(this.int2<di.int2) return true;
			else return false;
		}
	}
	public boolean isMoreThan(doubleInt di) {
		if(this.int1>di.int1) return true;
		else if(this.int1<di.int1)return false;
		else {
			if(this.int2>di.int2) return true;
			else return false;
		}
	}
	public boolean equals(doubleInt di) {return di.int1==this.int1 && di.int2 == this.int2;}
	public int compareTo(doubleInt di) {
		if(this.isLessThan(di)) return -1;
		else if(this.isMoreThan(di)) return 1;
		else return 0;
	}
}
