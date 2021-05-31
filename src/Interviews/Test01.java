package Interviews;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//oddEven(-2);

		// negative
		// zero
		// positive

		newMethodOddEven(101);
	}

	public static void oddEven(int p) {
		long i = Math.abs(p);

		float j = (float) i + 1;
		float k = j / 2;
		float h = (float) i / 2;

		System.out.println(k + " and " + h);
		for (int x = 0; x <= i; x++) {
			if (k == x) {
				System.out.println("odd number");
				break;
			}
			if (h == x) {
				System.out.println("even number");
				break;

			}
		}

	}

	public static void newMethodOddEven(int i) {
		double num = i;
		double ceil = Math.ceil(num / 2);

		if (ceil == num / 2) {
			System.out.println("num is even");
		} else
			System.out.println("num is odd");
	}
}
