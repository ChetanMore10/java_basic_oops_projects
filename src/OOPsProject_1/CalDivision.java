package OOPsProject_1;

public class CalDivision extends Calculator{

	@Override
	public int getDivision(int a, int b) {
		// TODO Auto-generated method stub
		return super.getDivision(a, b);
	}

	public int getDivision(int a, int b, int c) {
		int sum = a / b / c;
		return sum;
	}

	public int getDivision(int a, int b, int c, int d) {
		int sum = a / b / c / d;
		return sum;
	}

	public int getDivision(int a, int b, int c, int d, int e) {
		int sum = a / b / c / d / e;
		return sum;
	}
}
