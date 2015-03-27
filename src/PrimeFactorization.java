import java.util.ArrayList;

public class PrimeFactorization {

	public PrimeFactorization() {

	}

	public static ArrayList<Integer> primeFactorization(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (num % 2 == 0) {
			if (num == 0) {
				break;
			}
			list.add(2);
			num = num / 2;
		}
		if (num != 1) {
			if (num == 9) {
				list.add(3);
				list.add(3);
			} else {
				list.add(num);
			}
		}
		return list;
	}
}
