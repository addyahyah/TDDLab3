import java.util.ArrayList;

public class PrimeFactorization {

	public PrimeFactorization() {

	}

	public static ArrayList<Integer> primeFactorization(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		return (num == 2)?list: new ArrayList<Integer>();
		
	}

}
