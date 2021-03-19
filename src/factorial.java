
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = new factorial();
		int s = f.factorial_run(1);
		int rec = f.fact_rec(1);

		System.out.println("the fatorial of number is =" + s);
		System.out.println("the fatorial of number is =" + rec);

	}

	int sum = 1;

	public int factorial_run(int number) {

		while (number != 0) {
			sum = sum * (number);
			number--;
		}

		return sum;

	}

	int j = 1;

	public int fact_rec(int n) {

		if (n != 0) {

			j = n * fact_rec(n - 1);

		}

		else
			return 1;
		return j;
	}

}
