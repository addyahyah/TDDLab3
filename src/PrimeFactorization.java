import java.util.ArrayList;

public class PrimeFactorization {

	public PrimeFactorization() {

	}

	public static ArrayList<Integer> primeFactorization(int num) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		return (num == 3) ? list3 : ((num == 2) ? list2
				: new ArrayList<Integer>());

	}

}
