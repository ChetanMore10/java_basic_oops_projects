package OOPsProject_1;

public class CalMultiplication extends Calculator{

	@Override
	public int getMultiplication(int a, int b) {
		// TODO Auto-generated method stub
		return super.getMultiplication(a, b);
	}

	public int getMultiplication(int a, int b, int c) {
		int sum = a * b * c;
		return sum;
	}

	public int getMultiplication(int a, int b, int c, int d) {
		int sum = a * b * c * d;
		return sum;
	}

	public int getMultiplication(int a, int b, int c, int d, int e) {
		int sum = a * b * c * d * e;
		return sum;
	}
}
