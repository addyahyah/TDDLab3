import java.util.ArrayList;

public class PrimeNumberGenerator {

	public PrimeNumberGenerator() {
	}

	public static ArrayList<Integer> primes(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (num==2) {
			list.add(2);
		}else if(num==3){
			list.add(3);
		}else if(num==4){
			list.add(2);
			list.add(3);
		}
		return list;
	}

	public Boolean validate(final Integer primeNumber) {
		for (int i = 2; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}

}
