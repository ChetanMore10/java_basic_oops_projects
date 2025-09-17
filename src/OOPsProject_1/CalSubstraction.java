package OOPsProject_1;

public class CalSubstraction extends Calculator{

	@Override
	public int getSubstraction(int a, int b) {
		return super.getSubstraction(a, b);
	}

	public int getSubstraction(int a, int b, int c) {
		int sum = a - b - c;
		return sum;
	}

	public int getSubstraction(int a, int b, int c, int d) {
		int sum = a - b - c - d;
		return sum;
	}

	public int getSubstraction(int a, int b, int c, int d, int e) {
		int sum = a - b - c - d - e;
		return sum;
	}
}
