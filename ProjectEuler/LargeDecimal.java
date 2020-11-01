package ProjectEuler;

import java.math.BigInteger;

public class LargeDecimal {
	public int intPart;
	public String stuffAfterDecimal;
	public boolean sign;
	public static LargeDecimal pi = new LargeDecimal(3,"1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679",true);
	public static LargeDecimal one = new LargeDecimal(1,"0",true);
	public static LargeDecimal two = new LargeDecimal(2,"0",true);
	public static LargeDecimal zero = new LargeDecimal(0,"0",true);
	public static LargeDecimal ten = new LargeDecimal(10,"0",true);
	public static LargeDecimal negetive = new LargeDecimal(1,"0",false);
	public LargeDecimal(int intPart, String stuffAfterDecimal, boolean sign) {
		this.intPart = intPart;
		this.stuffAfterDecimal = stuffAfterDecimal;
		this.sign = sign;
	}
	public String toString() {
		String s = "";
		if(!this.getSign()) s+="-";
		s+=this.getIntPart()+"."+this.stuffAfterDecimal;
		return s;
	}
	public LargeDecimal divide(LargeDecimal divisor) {
		LargeDecimal one = this.copy();
		LargeDecimal two = divisor.copy();
		boolean sign = (one.getSign() == two.getSign());
		if(one.getStuffAfterDecimal().length() > two.getStuffAfterDecimal().length()) {
			two.expand(one.getStuffAfterDecimal().length());
		} else if(one.getStuffAfterDecimal().length() < two.getStuffAfterDecimal().length()) {
			one.expand(two.getStuffAfterDecimal().length());
		}
		one.expand(2*one.stuffAfterDecimal.length()+1);
		BigInteger oneb = new BigInteger(one.getIntPart()+one.getStuffAfterDecimal());
		BigInteger twob = new BigInteger(two.getIntPart()+two.getStuffAfterDecimal());
		BigInteger five = new BigInteger("5");
		BigInteger res = oneb.divide(twob).add(five);
		res = res.divide(BigInteger.TEN);
		LargeDecimal ans = new LargeDecimal(Integer.parseInt(res.divide(BigInteger.TEN.pow(two.getStuffAfterDecimal().length())).toString()),res.mod(BigInteger.TEN.pow(two.getStuffAfterDecimal().length())).toString(),sign);
		return ans;
	}
	public LargeDecimal sqrt(int length) {
		if(!this.sign) {
			throw new IllegalArgumentException();
		}
		LargeDecimal one = this.copy();
		one.expand(length*2);
		BigInteger oneb = new BigInteger(one.getIntPart()+one.getStuffAfterDecimal());
		oneb = MyU.sqrt(oneb);
		String s = oneb.toString();
		String s1 = s.substring(s.length()-length);
		s = s.substring(0, s.length()-length);
		LargeDecimal ans = new LargeDecimal(Integer.parseInt(s),s1,true);
		return ans;
	}
	public void syso() {
		System.out.println(this.toString());
	}
	public LargeDecimal multiply(LargeDecimal multiplier) {
		LargeDecimal one = this.copy();
		LargeDecimal two = multiplier.copy();
		boolean sign = (one.getSign() == two.getSign());
		if(one.getStuffAfterDecimal().length() > two.getStuffAfterDecimal().length()) {
			two.expand(one.getStuffAfterDecimal().length());
		} else if(one.getStuffAfterDecimal().length() < two.getStuffAfterDecimal().length()) {
			one.expand(two.getStuffAfterDecimal().length());
		}
		BigInteger oneb = new BigInteger(one.getIntPart()+one.getStuffAfterDecimal());
		BigInteger twob = new BigInteger(two.getIntPart()+two.getStuffAfterDecimal());
		BigInteger res = oneb.multiply(twob);
		LargeDecimal ans = new LargeDecimal(Integer.parseInt(res.divide(BigInteger.TEN.pow(two.getStuffAfterDecimal().length()*2)).toString()),res.mod(BigInteger.TEN.pow(two.getStuffAfterDecimal().length()*2)).toString(),sign);
		return ans;
	}
	public LargeDecimal add(LargeDecimal adder) {
		LargeDecimal one = this.copy();
		LargeDecimal two = adder.copy();
		if(one.getStuffAfterDecimal().length() > two.getStuffAfterDecimal().length()) {
			two.expand(one.getStuffAfterDecimal().length());
		} else if(one.getStuffAfterDecimal().length() < two.getStuffAfterDecimal().length()) {
			one.expand(two.getStuffAfterDecimal().length());
		}
		BigInteger oneb = new BigInteger(one.getIntPart()+one.getStuffAfterDecimal());
		BigInteger twob = new BigInteger(two.getIntPart()+two.getStuffAfterDecimal());
		BigInteger res = oneb.add(twob);
		LargeDecimal ans = new LargeDecimal(Integer.parseInt(res.divide(BigInteger.TEN.pow(two.getStuffAfterDecimal().length())).toString()),res.mod(BigInteger.TEN.pow(two.getStuffAfterDecimal().length())).toString(),res.compareTo(BigInteger.ZERO) == 1);
		return ans;
	}
	public LargeDecimal subtract(LargeDecimal adder) {
		LargeDecimal one = this.copy();
		LargeDecimal two = adder.copy();
		
		if(one.getStuffAfterDecimal().length() > two.getStuffAfterDecimal().length()) {
			two.expand(one.getStuffAfterDecimal().length());
		} else if(one.getStuffAfterDecimal().length() < two.getStuffAfterDecimal().length()) {
			one.expand(two.getStuffAfterDecimal().length());
		}
		BigInteger oneb = new BigInteger(one.getIntPart()+one.getStuffAfterDecimal());
		BigInteger twob = new BigInteger(two.getIntPart()+two.getStuffAfterDecimal());
		BigInteger res = oneb.add(twob);
		LargeDecimal ans = new LargeDecimal(Integer.parseInt(res.divide(BigInteger.TEN.pow(two.getStuffAfterDecimal().length())).toString()),res.mod(BigInteger.TEN.pow(two.getStuffAfterDecimal().length())).toString(),res.compareTo(BigInteger.ZERO) == 1);
		return ans;
	}
	public LargeDecimal pow(int exponent) {
		LargeDecimal prod = this.copy();
		for(int i = 0; i<exponent; i++) {
			prod.multiply(this);
		}
		return prod;
	}
	public LargeDecimal mod(LargeDecimal modulus) {
		return this.subtract(modulus.multiply(new LargeDecimal(Math.abs(this.divide(modulus).intPart),"0",this.sign==modulus.sign)));
	}
	public LargeDecimal modPow(int exponent, LargeDecimal modulus) {
		LargeDecimal prod = this.copy();
		for(int i = 0; i<exponent; i++) {
			prod.multiply(this);
			prod.mod(modulus);
		}
		return prod;
	}
	public String expand(int newLength) {
		if(stuffAfterDecimal.length() < newLength) {
			for(int i = this.stuffAfterDecimal.length(); i<newLength; i++) {
				stuffAfterDecimal+="0";
			}
		} else if(stuffAfterDecimal.length() > newLength) {
			stuffAfterDecimal = stuffAfterDecimal.substring(0, newLength);
		}
		return stuffAfterDecimal;
	}
	public LargeDecimal copy() {
		LargeDecimal copy = new LargeDecimal(this.intPart, this.stuffAfterDecimal, this.sign);
		return copy;
	}
	public boolean getSign() {
		return sign;
	}
	public void setSign(boolean sign) {
		this.sign = sign;
	}
	public int getIntPart() {
		return intPart;
	}
	public void setIntPart(int intPart) {
		this.intPart = intPart;
	}
	public String getStuffAfterDecimal() {
		return stuffAfterDecimal;
	}
	public void setStuffAfterDecimal(String stuffAfterDecimal) {
		this.stuffAfterDecimal = stuffAfterDecimal;
	}
}
