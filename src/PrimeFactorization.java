import java.util.ArrayList;

public class PrimeFactorization {

	public PrimeFactorization() {

	}

	public static ArrayList<Integer> primeFactorization(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				list.add(i);
				num = num / i;
			}	
		}
		if (num != 1) {
			list.add(num);
		}
		return list;
	}
}
