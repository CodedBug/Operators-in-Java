package ternaryOperatorsExample;

public class TernaryOperatorsExample {

	static String m1(boolean b) {
		return b ? "T" : "F";
	}

	public static void main(String[] args) {
		boolean t1 = false ? false : true ? false : true ? false : true;
		boolean t2 = false ? false : (true ? false : (true ? false : true));
		boolean t3 = ((false ? false : true) ? false : true) ? false : true;
		System.out.println(m1(t1) + m1(t2) + m1(t3));
	}
}
