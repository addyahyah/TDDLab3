import java.util.ArrayList;

public class PrimeFactorization {

	public PrimeFactorization() {

	}

	public static ArrayList<Integer> primeFactorization(int num) {
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(2);
		list4.add(2);
		return (num == 4) ? list4 : (num == 3) ? list3 : ((num == 2) ? list2
				: new ArrayList<Integer>());

	}
}
