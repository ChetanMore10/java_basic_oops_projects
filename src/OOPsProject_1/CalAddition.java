package OOPsProject_1;

public class CalAddition extends Calculator {

	@Override
	public int getAddition(int a, int b) {
		return super.getAddition(a, b);
	}

	public int getAddition(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

	public int getAddition(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		return sum;
	}

	public int getAddition(int a, int b, int c, int d, int e) {
		int sum = a + b + c + d + e;
		return sum;
	}
	
	public void name() {
		System.out.println("Nilesh");
	}
}
